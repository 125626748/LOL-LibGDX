package edu.bjfu.lol.scenes.scene2d.����;

import java.util.LinkedList;

import edu.bjfu.lol.scenes.scene2d.����.������;
import edu.bjfu.lol.scenes.scene2d.����.���ж�����;
import edu.bjfu.lol.screen.��ս��Ļ��;

/**
 * �����������������ɲ��ж�����չʾ��ս���
 */
public class ���������� extends ������
{
	private LinkedList<������> �������� = new LinkedList<������>();
	@Override
	public void ���ɲ���Ӷ���(��ս��Ļ�� ��ս��Ļ)
	{
		���ж����� ���ж��� = new ���ж�����();
		for (������ ���� : ��������)
		{
			���ж���.��Ӷ���(����.���ɶ���());
		}
		��ս��Ļ��.ʵ��.��Ӷ���(���ж���);
	}
	public void �������(������ ����)
	{
		��������.add(����);
	}
	/**
	 * ���ж�����������ɲ��ж��������Է���null����
	 */
	@Override
	public ������ ���ɶ���()
	{
		return null;
	}
}
