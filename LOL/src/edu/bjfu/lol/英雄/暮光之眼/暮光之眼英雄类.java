package edu.bjfu.lol.Ӣ��.ĺ��֮��;

import edu.bjfu.lol.��̬.��ս��Ӣ����;
import edu.bjfu.lol.Ӣ��.ĺ��֮��.�̷���аն������.�̷���аն״̬��;
import edu.bjfu.lol.��̬.������;
import edu.bjfu.lol.��̬.Ӣ��������;
import edu.bjfu.lol.��̬.Ӣ����;

public class ĺ��֮��Ӣ���� extends Ӣ����
{
	private ������[] �������� = new ������[5];
	private Ӣ�������� Ӣ������ = new Ӣ��������();
	public ĺ��֮��Ӣ����()
	{
		��������[0] = new �̷���аն������();
		��������[1] = new ����ȴа������();
		��������[2] = new ������Ҽ�����();
		��������[3] = new ����Ӱ��������();
		��������[4] = new �ذ���ȱ��Ȼ��似����();
		Ӣ������.set����ֵ(19);
		Ӣ������.setħ������(30);
		Ӣ������.set����ֵ(335);
		Ӣ������.set�����ٶ�(0.651f);
		Ӣ������.set������(58);
		Ӣ������.set�����ظ�(8);
		Ӣ������.set�������ֵ(513);
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
		return "ĺ��֮��";
	}
	@Override
	public String getӢ��Ƥ���ļ���()
	{
		return "Shen";
	}
	@Override
	public boolean is��ս(��ս��Ӣ���� ��ս��Ӣ��)
	{
		return true;
	}
	@Override
	public String getӢ���չ������ļ���(��ս��Ӣ���� ��ս��Ӣ��)
	{
		if (((�̷���аն״̬��)��ս��Ӣ��.get��ͨ��������Ч��״̬(�̷���аն������.�̷���аն״̬��.class)).is����׼������())
		{
			return "ShenAttackWithSkillPassive.mp3";
		}
		else
		{
			return "ShenAttackWithoutSkillPassive.mp3";
		}
	}
}
