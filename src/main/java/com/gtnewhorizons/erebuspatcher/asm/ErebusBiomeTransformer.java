package com.gtnewhorizons.erebuspatcher.asm;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.InsnNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;

import net.minecraft.launchwrapper.IClassTransformer;

public class ErebusBiomeTransformer implements IClassTransformer, Opcodes {

	@Override
	public byte[] transform(String className, String newClassName, byte[] origCode) {
		if(className.equals("erebus.ModBiomes"))
			return patchErebusBiomes(origCode);
		return origCode;
	}

	private static byte[] patchErebusBiomes(byte[] origCode) {
		final String methodToPatch1 = "init";
		final String methodToPatch2 = "postInit";

		ClassReader cr = new ClassReader(origCode);
		ClassNode classNode = new ClassNode();
		cr.accept(classNode, 0);
		for(MethodNode methodNode : classNode.methods)
			if(methodNode.name.equals(methodToPatch1)||methodNode.name.equals(methodToPatch2)){
				while(methodNode.instructions.iterator().hasNext()) {
					methodNode.instructions.remove(methodNode.instructions.iterator().next());
				}

				InsnList endList=new InsnList();
				endList.add(new MethodInsnNode(Opcodes.INVOKESTATIC, "com/gtnewhorizons/erebuspatcher/ErebusBiomes", methodNode.name, "()V", false));
				endList.add(new InsnNode(Opcodes.RETURN));
				methodNode.instructions.add(endList);
			}

		ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS);
		classNode.accept(cw);

		return cw.toByteArray();

	}


}
