package edu.bjfu.lol.Ӣ��.�޼���ʥ;

import edu.bjfu.lol.��̬.��ս��Ӣ����;
import edu.bjfu.lol.��̬.������;
import edu.bjfu.lol.��̬.Ӣ��������;
import edu.bjfu.lol.��̬.Ӣ����;

public class �޼���ʥӢ���� extends Ӣ����
{
	private ������[] �������� = new ������[5];
	private Ӣ�������� Ӣ������ = new Ӣ��������();
	public �޼���ʥӢ����()
	{
		// ���ü���
		��������[0] = new ˫�ش��������();
		��������[1] = new ������ͻϮ������();
		��������[2] = new ڤ�뼼����();
		��������[3] = new �޼�����������();
		��������[4] = new ��ԭѪͳ������();
		// ����Ӣ������
		Ӣ������.set������(58);
		Ӣ������.set�����ٶ�(0.679f);
		Ӣ������.set����ֵ(355);
		Ӣ������.set����ֵ(18);
		Ӣ������.setħ������(31);
		Ӣ������.set�������ֵ(536);
		Ӣ������.set�����ظ�(7);
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
		return "�޼���ʥ";
	}
	@Override
	public String getӢ��Ƥ���ļ���()
	{
		return "MasterYi";
	}
	@Override
	public boolean is��ս(��ս��Ӣ���� ��ս��Ӣ��)
	{
		return true;
	}
	@Override
	public String getӢ���չ������ļ���(��ս��Ӣ���� ��ս��Ӣ��)
	{
		return "MasterYiAttack.mp3";
	}
}
