package edu.bjfu.lol.Ӣ��.��Ѫ����;

import edu.bjfu.lol.��̬.��ս��Ӣ����;
import edu.bjfu.lol.��̬.������;
import edu.bjfu.lol.��̬.Ӣ��������;
import edu.bjfu.lol.��̬.Ӣ����;

public class ��Ѫ����Ӣ���� extends Ӣ���� {

	private ������[] �������� = new ������[5];
	private Ӣ�������� Ӣ������ = new Ӣ��������();
	public ��Ѫ����Ӣ����()
	{
		��������[0] = new Ѫ֮���ʼ�����();
		��������[1] = new ��Ѫ����������();
		��������[2] = new ����ŭ������();
		��������[3] = new Ѫ��׷�ټ�����();
		��������[4] = new �޾�����������();
		Ӣ������.set������(60);
		Ӣ������.set�����ٶ�(0.679f);
		Ӣ������.set����ֵ(345);
		Ӣ������.set����ֵ(20);
		Ӣ������.setħ������(31);
		Ӣ������.set�������ֵ(526);
		Ӣ������.set�����ظ�(8);
	}
	@Override
	public Ӣ�������� getӢ������() {
		return Ӣ������;
	}
	@Override
	public ������[] get��������() {
		return ��������;
	}
	@Override
	public String getӢ������() {
		return "��Ѫ����";
	}
	@Override
	public String getӢ��Ƥ���ļ���()
	{
		return "Warwick";
	}
	@Override
	public boolean is��ս(��ս��Ӣ���� ��ս��Ӣ��)
	{
		return true;
	}
	@Override
	public String getӢ���չ������ļ���(��ս��Ӣ���� ��ս��Ӣ��)
	{
		return "WarwickAttack.mp3";
	}
}
