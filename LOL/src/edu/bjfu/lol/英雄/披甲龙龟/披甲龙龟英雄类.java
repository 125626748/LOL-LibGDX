package edu.bjfu.lol.Ӣ��.��������;

import edu.bjfu.lol.��̬.��ս��Ӣ����;
import edu.bjfu.lol.��̬.������;
import edu.bjfu.lol.��̬.Ӣ��������;
import edu.bjfu.lol.��̬.Ӣ����;

public class ��������Ӣ���� extends Ӣ���� {

	private ������[] �������� = new ������[5];
	private Ӣ�������� Ӣ������ = new Ӣ��������();
	public ��������Ӣ����() {
		��������[0] = new ׶�̼׿Ǽ�����();
		��������[1] = new ������̼�����(); 
		��������[2] = new ��̷���������();
		��������[3] = new �Ƽ׳�������();
		��������[4] = new �ض�ɽҡ������();
		Ӣ������.set�������ֵ(420);
		Ӣ������.set����ֵ(25);
		Ӣ������.setħ������(30);
		Ӣ������.set�����ظ�(8);
		Ӣ������.set������(50);
		Ӣ������.set����ֵ(335);
		Ӣ������.set�����ٶ�(0.63f);
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
		return "��������";
	}
	@Override
	public String getӢ��Ƥ���ļ���()
	{
		return "Rammus";
	}
	@Override
	public boolean is��ս(��ս��Ӣ���� ��ս��Ӣ��)
	{
		return true;
	}
	@Override
	public String getӢ���չ������ļ���(��ս��Ӣ���� ��ս��Ӣ��)
	{
		return "RammusAttack.mp3";
	}
}
