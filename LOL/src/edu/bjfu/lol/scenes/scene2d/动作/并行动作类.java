package edu.bjfu.lol.scenes.scene2d.����;

import java.util.LinkedList;


public class ���ж����� extends ������
{
	private LinkedList<������> �������� = new LinkedList<������>();
	public void ��Ӷ���(������ ����)
	{
		��������.add(����);
	}
	/**
	 * ���ж�������ɲ������
	 */
	@Override
	public boolean is���()
	{
		boolean is��� = true;
		for (int i = 0; i < ��������.size(); i++)
		{
			if (��������.get(i).is���())
			{
				��������.remove(i);
				i--;
			}
			else
			{
				is��� = false;
			}
		}
		return is���;
	}
	@Override
	public void ��ʼ()
	{
		for (������ ���� : ��������)
		{
			����.��ʼ();
		}
	}
}
