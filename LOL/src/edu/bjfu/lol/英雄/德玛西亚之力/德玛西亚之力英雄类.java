package edu.bjfu.lol.Ӣ��.��������֮��;

import edu.bjfu.lol.��̬.��ս��Ӣ����;
import edu.bjfu.lol.��̬.������;
import edu.bjfu.lol.��̬.Ӣ��������;
import edu.bjfu.lol.��̬.Ӣ����;

public class ��������֮��Ӣ���� extends Ӣ���� {
	private ������[] �������� = new ������[5];
	private Ӣ�������� Ӣ������ = new Ӣ��������();
	public ��������֮��Ӣ����()
	{
		��������[0] = new ���ͼ�����();
		��������[1] = new �������������();
		��������[2] = new ����������();
		��������[3] = new ���м�����();
		��������[4] = new �����������弼����();
		Ӣ������.set������(56);
		Ӣ������.set�������ֵ(611);
		Ӣ������.set�����ظ�(20);
		Ӣ������.set�����ٶ�(0.625f);
		Ӣ������.set����ֵ(345);
		Ӣ������.set����ֵ(22);
		Ӣ������.setħ������(31);
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
		return "��������֮��";
	}
	@Override
	public String getӢ��Ƥ���ļ���()
	{
		return "Garen";
	}
	@Override
	public boolean is��ս(��ս��Ӣ���� ��ս��Ӣ��)
	{
		return true;
	}
	@Override
	public String getӢ���չ������ļ���(��ս��Ӣ���� ��ս��Ӣ��)
	{
		if (��ս��Ӣ��.get��ͨ��������Ч��״̬(�������������.��һ�ι�����ɶ����˺�״̬��.class) == null)
		{
			return "GarenAttack.mp3";
		}
		else
		{
			return "GarenSkillQSilence.mp3";
		}
	}
}
