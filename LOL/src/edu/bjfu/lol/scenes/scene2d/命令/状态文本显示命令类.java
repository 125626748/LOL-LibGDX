package edu.bjfu.lol.scenes.scene2d.����;

import edu.bjfu.lol.scenes.scene2d.����.������;
import edu.bjfu.lol.scenes.scene2d.����.״̬�ı���ʾ������;
import edu.bjfu.lol.screen.��ս��Ļ��;

public class ״̬�ı���ʾ������ extends ������
{
	private boolean is�ҷ�;
	private int Ӣ������λ��;
	private String �ı�;
	private boolean is����;
	public ״̬�ı���ʾ������(boolean is�ҷ�, int Ӣ������λ��, String �ı�, boolean is����)
	{
		this.is�ҷ� = is�ҷ�;
		this.Ӣ������λ�� = Ӣ������λ��;
		this.�ı� = �ı�;
		this.is���� = is����;
	}
	@Override
	protected ������ ���ɶ���()
	{
		return new ״̬�ı���ʾ������(��ս��Ļ��.ʵ��.getӢ������(is�ҷ�, Ӣ������λ��), �ı�, is����);
	}
}
