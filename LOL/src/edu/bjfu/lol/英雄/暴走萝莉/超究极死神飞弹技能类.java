package edu.bjfu.lol.Ӣ��.��������;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.g2d.ParticleEffect;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;

import edu.bjfu.lol.scenes.scene2d.actions.�ӳ�Action;
import edu.bjfu.lol.scenes.scene2d.actions.�����ƶ�Action;
import edu.bjfu.lol.scenes.scene2d.ui.������Ա��;
import edu.bjfu.lol.scenes.scene2d.����.������;
import edu.bjfu.lol.scenes.scene2d.����.������;
import edu.bjfu.lol.scenes.scene2d.����.������װ����;
import edu.bjfu.lol.scenes.scene2d.����.����������;
import edu.bjfu.lol.screen.��ս��Ļ��;
import edu.bjfu.lol.utils.������;
import edu.bjfu.lol.utils.���ֲ������Զ�������;
import edu.bjfu.lol.��̬.��ս��Ӣ����;
import edu.bjfu.lol.��̬.��ս��������;
import edu.bjfu.lol.�߼�.������;
import edu.bjfu.lol.��̬.������;
import edu.bjfu.lol.��̬.Ӣ����;

class ����������ɵ������� extends ������
{
	private static final int ��һ���ͷŻغ��� = 3;
	private static final int �ͷż���غ��� = 15;
	private static final int ��һ�Ż����˺� = 150;
	private static final int �ڶ��Ż����˺� = 200;
	private static final int �����Ż����˺� = 250;
	private static final float �����˺���ռ���������� = 0.5f;
	private static final float Ŀ��ʧȥ����ֵ�ٷֱ� = 25f / 100;
	private static final float ��Χ���˳����˺��ٷֱ� = 80f / 100;
	private static final float ������ = 70f / 100;
	private static final String ������ = "����������ɵ�";
	private static final String �������� = String.format("%s  ���һ֧���,�����Խʱ��Խ��,�˺�ֵԽ��,�ڻ���\n��һ�����˺�����ը,���%d/%d/%d(+%.1f������)����%.0f%%Ŀ��\nʧȥ����ֵ�������˺�,�����ĵ��˻����%.0f%%�˺�,������%.0f%%.", 
			������,
			��һ�Ż����˺�, �ڶ��Ż����˺�, �����Ż����˺�, �����˺���ռ����������, Ŀ��ʧȥ����ֵ�ٷֱ� * 100, ��Χ���˳����˺��ٷֱ� * 100, ������ * 100);
	public ����������ɵ�������()
	{
		super(��һ���ͷŻغ���, �ͷż���غ���);
	}
	private class �ͷŶ����� extends ������
	{
		private �ӳ�Action �ӳ� = new �ӳ�Action(0.1f);
		private ������Ա�� ����;
		private Music ��Ч;
		public �ͷŶ�����(float ������x, float ������y, float ������x, float ������y, String Ӣ��Ƥ���ļ���)
		{
			ParticleEffect ����Ч�� = new ParticleEffect();
			����Ч��.load(Gdx.files.internal(������.����Ŀ¼ + "JinxSkillR.p"), Ӣ����.getƤ����Դ(Ӣ��Ƥ���ļ���).getAtlas());
			float �Ƕ� = (float)(Math.atan((������y-������y)/(������x-������x)) / Math.PI * 180) - 90;
			if (������x < ������x)
			{
				�Ƕ� += 180;
			}
			����Ч��.findEmitter("Untitled").getRotation().setHigh(�Ƕ�);
			���� = new ������Ա��(����Ч��);
			����.setPosition(������x, ������y);
			�����ƶ�Action �ƶ�Action = new �����ƶ�Action(������x, ������y, 0.3f);
			����.addAction(Actions.sequence(�ƶ�Action, �ӳ�));
			��Ч = Gdx.audio.newMusic(Gdx.files.internal(������.����Ŀ¼ + "JinxSkillR.mp3"));
			��Ч.setOnCompletionListener(new ���ֲ������Զ�������());
		}
		@Override
		public boolean is���()
		{
			if (�ӳ�.isAction�ѽ���())
			{
				����.remove();
				����.dispose();
				return true;
			}
			else
			{
				return false;
			}
		}
		@Override
		public void ��ʼ()
		{
			��ս��Ļ��.ʵ��.�����Ա(����);
			��Ч.play();
		}
	}
	private class �ͷ������� extends ������
	{
		private float ������x;
		private float ������y;
		private float ������x;
		private float ������y;
		private String Ӣ��Ƥ���ļ���;
		public �ͷ�������(float ������x, float ������y, float ������x, float ������y, String Ӣ��Ƥ���ļ���)
		{
			this.������x = ������x;
			this.������y = ������y;
			this.������x = ������x;
			this.������y = ������y;
			this.Ӣ��Ƥ���ļ��� = Ӣ��Ƥ���ļ���;
		}
		@Override
		protected ������ ���ɶ���()
		{
			return new �ͷŶ�����(������x, ������y, ������x, ������y, Ӣ��Ƥ���ļ���);
		}
	}
	@Override
	public boolean �ͷ�(��ս�������� �з�����, ��ս��Ӣ���� �ͷŴ˼��ܵ�Ӣ��)
	{
		��ս��Ӣ���� ���е��� = �з�����.get���������Ӣ��(true);
		if (������.����_����_�����Ƿ���(������))
		{
			int ���е����������ֵ = ���е���.get��ս���������ֵ();
			int �����˺� = (int) (�ͷŴ˼��ܵ�Ӣ��.get��ս�й�����() * �����˺���ռ���������� + Ŀ��ʧȥ����ֵ�ٷֱ� * ((���е����������ֵ - ���е���.get��ս������ֵ()) / ���е����������ֵ));
			int ��ֵ��͸ = �ͷŴ˼��ܵ�Ӣ��.get��ս����ֵ���״�͸();
			float �ٷֱȴ�͸ = �ͷŴ˼��ܵ�Ӣ��.get��ս�аٷֱȻ��״�͸();
			int ���˺� = 0;
			switch (���е���.getӢ������λ��())
			{
				case 1:
				case 2:
					�����˺� += ��һ�Ż����˺�;
					break;
				case 3:
				case 4:
					�����˺� += �ڶ��Ż����˺�;
					break;
				case 5:
					�����˺� += �����Ż����˺�;
					break;
			}
			���������� �������� = new ����������();
			���˺� += ���е���.����������˺�(�ͷŴ˼��ܵ�Ӣ��, �����˺�, ��ֵ��͸, �ٷֱȴ�͸, ��������);
			if (�ͷŴ˼��ܵ�Ӣ��.is�ҷ�())
			{
				��������.�������(new �ͷ�������(
						��ս��Ļ��.�ҷ�X��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1],
						��ս��Ļ��.�ҷ�Y��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1],
						��ս��Ļ��.�з�X��������[���е���.getӢ������λ��() - 1],
						��ս��Ļ��.�з�Y��������[���е���.getӢ������λ��() - 1],
						�ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���()));
			}
			else
			{
				��������.�������(new �ͷ�������(
						��ս��Ļ��.�з�X��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1],
						��ս��Ļ��.�з�Y��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1],
						��ս��Ļ��.�ҷ�X��������[���е���.getӢ������λ��() - 1],
						��ս��Ļ��.�ҷ�Y��������[���е���.getӢ������λ��() - 1],
						�ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���()));
			}
			int �����˺� = (int) (�����˺� * ��Χ���˳����˺��ٷֱ�);
			for (��ս��Ӣ���� ��Χ���� : �з�����.get������Ӣ������С��ΧӢ������(���е���))
			{
				if (��Χ���� != null && !��Χ����.is����() && ��Χ���� != ���е���)
				{
					if (������.����_����_�����Ƿ���(������))
					{
						���˺� += ��Χ����.����������˺�(�ͷŴ˼��ܵ�Ӣ��, �����˺�, ��ֵ��͸, �ٷֱȴ�͸, ��������);
					}
				}
			}
			������װ����.ʵ��.�������(��������);
			�ͷŴ˼��ܵ�Ӣ��.������Ѫ(���˺�, true);
		}
		return true;
	}
	@Override
	public String get��������()
	{
		return ��������;
	}
	@Override
	public String get������()
	{
		return ������;
	}
	@Override
	public String get�����ļ���׺()
	{
		return "E";
	}
	@Override
	public boolean is����()
	{
		return true;
	}
}
