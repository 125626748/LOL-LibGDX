package edu.bjfu.lol.scenes.scene2d.����;

import edu.bjfu.lol.screen.��ս��Ļ��.Ӣ��������;

public class ����Ӣ��Ѫ�������� extends ������
{
	private Ӣ�������� Ӣ��;
	private float �ٷֱ�;
	public ����Ӣ��Ѫ��������(Ӣ�������� Ӣ��, float �ٷֱ�)
	{
		this.Ӣ�� = Ӣ��;
		this.�ٷֱ� = �ٷֱ�;
	}
	@Override
	public boolean is���()
	{
		return true;
	}
	@Override
	public void ��ʼ()
	{
		Ӣ��.����Ѫ���ٷֱ�(�ٷֱ�);
	}
}