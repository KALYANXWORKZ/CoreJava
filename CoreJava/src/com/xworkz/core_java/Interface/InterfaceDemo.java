package com.xworkz.core_java.Interface;

public class InterfaceDemo
{
	public static void main(String[] args)
	{
		Computer comp = new Computer();
		Sony sony = new Sony();
		Epson epson = new Epson();
		
		comp.slot(epson);
		comp.slot(sony);
	}
}
