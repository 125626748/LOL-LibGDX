package edu.bjfu.lol.scenes.scene2d.����;

import java.util.LinkedList;
import java.util.Queue;

import edu.bjfu.lol.scenes.scene2d.����.������;

public class ������װ����
{
	public static ������װ���� ʵ�� = new ������װ����();
	private Queue<������> ������� = new LinkedList<������>();
	private Queue<������> �ӳ����������� = new LinkedList<������>();
	/**
	 * ��������ӵ��ӳ���Ӷ����У������������һ������������ʱ��ӵ��Ǹ�����ĺ���
	 */
	public void �ӳ��������(������ ����)
	{
		�ӳ�����������.add(����);
	}
	public void �������(������ ����)
	{
		�������.add(����);
		if (!�ӳ�����������.isEmpty())
		{
			�������.addAll(�ӳ�����������);
			�ӳ�����������.clear();
		}
	}
	/**
	 * ������װ��֮����ø÷����õ��������
	 */
	public Queue<������> get�������()
	{
		if (!�ӳ�����������.isEmpty())
		{
			�������.addAll(�ӳ�����������);
			�ӳ�����������.clear();
		}
		return �������;
	}
}
