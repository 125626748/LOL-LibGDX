package edu.bjfu.lol.scenes.scene2d.����;

import edu.bjfu.lol.scenes.scene2d.����.������;
import edu.bjfu.lol.scenes.scene2d.����.����ǰҡ������;
import edu.bjfu.lol.screen.��ս��Ļ��;

public class ����ǰҡ������ extends ������
{
	private boolean is�ҷ�;
	private int Ӣ������λ��;
	private boolean is�����ι���;
	private boolean is��ս;
	public ����ǰҡ������(boolean is�ҷ�, int Ӣ������λ��, boolean is�����ι���, boolean is��ս)
	{
		this.is�ҷ� = is�ҷ�;
		this.Ӣ������λ�� = Ӣ������λ��;
		this.is�����ι��� = is�����ι���;
		this.is��ս = is��ս;
	}
	@Override
	protected ������ ���ɶ���()
	{
		return new ����ǰҡ������(��ս��Ļ��.ʵ��.getӢ������(is�ҷ�, Ӣ������λ��), is�����ι���, is��ս, is�ҷ�);
	}
}
