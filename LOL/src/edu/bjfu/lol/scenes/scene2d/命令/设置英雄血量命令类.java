package edu.bjfu.lol.scenes.scene2d.����;

import edu.bjfu.lol.scenes.scene2d.����.������;
import edu.bjfu.lol.scenes.scene2d.����.����Ӣ��Ѫ��������;
import edu.bjfu.lol.screen.��ս��Ļ��;

public class ����Ӣ��Ѫ�������� extends ������
{
	private boolean is�ҷ�;
	private int Ӣ������λ��;
	private float �ٷֱ�;
	public ����Ӣ��Ѫ��������(boolean is�ҷ�, int Ӣ������λ��, float �ٷֱ�)
	{
		this.is�ҷ� = is�ҷ�;
		this.Ӣ������λ�� = Ӣ������λ��;
		this.�ٷֱ� = �ٷֱ�;
	}
	@Override
	protected ������ ���ɶ���()
	{
		return new ����Ӣ��Ѫ��������(��ս��Ļ��.ʵ��.getӢ������(is�ҷ�, Ӣ������λ��), �ٷֱ�);
	}
}
