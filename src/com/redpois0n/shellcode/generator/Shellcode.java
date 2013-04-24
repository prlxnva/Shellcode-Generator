package com.redpois0n.shellcode.generator;

public interface Shellcode {

	public abstract String generate(String arrayName, byte[] array) throws Exception;
}
