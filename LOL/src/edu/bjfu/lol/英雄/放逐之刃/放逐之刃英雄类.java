package edu.bjfu.lol.Ӣ��.����֮��;

import edu.bjfu.lol.��̬.��ս��Ӣ����;
import edu.bjfu.lol.��̬.������;
import edu.bjfu.lol.��̬.Ӣ��������;
import edu.bjfu.lol.��̬.Ӣ����;

public class ����֮��Ӣ���� extends Ӣ����
{
	private ������[] �������� = new ������[5];
	private Ӣ�������� Ӣ������ = new Ӣ��������();
	public ����֮��Ӣ����()
	{
		��������[0] = new ����֮�м�����();
		��������[1] = new ����֮�輼����(); 
		��������[2] = new ���ŭ������();
		��������[3] = new ����ֱǰ������();
		��������[4] = new ����֮�漼����();
		Ӣ������.set�������ֵ(414);
		Ӣ������.set����ֵ(15);
		Ӣ������.set����ֵ(345);
		Ӣ������.set������(54);
		Ӣ������.set�����ظ�(5);
		Ӣ������.setħ������(30);
		Ӣ������.set�����ٶ�(0.679f);
	}
	@Override
	public Ӣ�������� getӢ������()
	{
		return Ӣ������;
	}
	@Override
	public ������[] get��������()
	{
		return ��������;
	}
	@Override
	public String getӢ������()
	{
		return "����֮��";
	}
	@Override
	public String getӢ��Ƥ���ļ���()
	{
		return "Riven";
	}
	@Override
	public boolean is��ս(��ս��Ӣ���� ��ս��Ӣ��)
	{
		return true;
	}
	@Override
	public String getӢ���չ������ļ���(��ս��Ӣ���� ��ս��Ӣ��)
	{
		return "RivenAttack.mp3";
	}
}
