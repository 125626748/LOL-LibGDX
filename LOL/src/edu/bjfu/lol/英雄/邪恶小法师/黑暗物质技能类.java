package edu.bjfu.lol.Ӣ��.а��С��ʦ;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.g2d.ParticleEffect;
import com.badlogic.gdx.scenes.scene2d.Actor;

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
import edu.bjfu.lol.��̬.������;
import edu.bjfu.lol.��̬.Ӣ����;

class �ڰ����ʼ����� extends ������
{
	private static final int ��һ���ͷŻغ��� = 1;
	private static final int �ͷż���غ��� = 5;
	private static final int �����˺� = 120;
	private static final float �����˺���ռ����ǿ�ȱ��� = 1;
	private static final String ������ = "�ڰ�����";
	private static final String �������� = String.format("%s  �ڰ����ʽ��������,�Եз����С��Χ��λ���%d(+%.0f����\nǿ��)ħ���˺�.", 
			������,
			�����˺�, �����˺���ռ����ǿ�ȱ���);
	public �ڰ����ʼ�����()
	{
		super(��һ���ͷŻغ���, �ͷż���غ���);
	}
	private static class �ͷ������� extends ������
	{
		private float ������X;
		private float ������Y;
		private String Ӣ��Ƥ���ļ���;
		public �ͷ�������(float ������x, float ������y, String Ӣ��Ƥ���ļ���)
		{
			������X = ������x;
			������Y = ������y;
			this.Ӣ��Ƥ���ļ��� = Ӣ��Ƥ���ļ���;
		}
		@Override
		protected ������ ���ɶ���()
		{
			return new �ͷŶ�����(������X, ������Y, Ӣ��Ƥ���ļ���);
		}
	}
	private static class �ͷŶ����� extends ������
	{
		private static final int ����߶� = 300;
		private �ӳ�Action ����ǰ�ӳ� = new �ӳ�Action(0.9f);
		private Actor ����ǰ�ӳ���Ա = new Actor();
		private �����ƶ�Action ����Action;
		private boolean is�����ѿ�ʼ;
		private boolean is�������Ƴ�;
		private �ӳ�Action ��ը�ӳ� = new �ӳ�Action(0.25f);
		private ������Ա�� ��������;
		private ������Ա�� ��ը����;
		private Music ��Ч;
		private �ͷŶ�����(float ������X, float ������Y, String Ӣ��Ƥ���ļ���)
		{
			ParticleEffect ����Ч�� = new ParticleEffect();
			����Ч��.load(Gdx.files.internal(������.����Ŀ¼ + "VeigarSkillWExplode.p"), Ӣ����.getƤ����Դ(Ӣ��Ƥ���ļ���).getAtlas());
			��ը���� = new ������Ա��(����Ч��);
			��ը����.setPosition(������X, ������Y);
			��ը����.addAction(��ը�ӳ�);
			����Ч�� = new ParticleEffect();
			����Ч��.load(Gdx.files.internal(������.����Ŀ¼ + "VeigarSkillWFall.p"), Ӣ����.getƤ����Դ(Ӣ��Ƥ���ļ���).getAtlas());
			�������� = new ������Ա��(����Ч��);
			��������.setPosition(������X, ������Y + ����߶�);
			����Action = new �����ƶ�Action(������X, ������Y, 0.4f);
			��������.addAction(����Action);
			����ǰ�ӳ���Ա.addAction(����ǰ�ӳ�);
			��Ч = Gdx.audio.newMusic(Gdx.files.internal(������.����Ŀ¼ + "VeigarSkillW.mp3"));
			��Ч.setOnCompletionListener(new ���ֲ������Զ�������());
		}
		@Override
		public boolean is���()
		{
			if (����ǰ�ӳ�.isAction�ѽ���())
			{
				if (!is�����ѿ�ʼ)
				{
					��ս��Ļ��.ʵ��.�����Ա(��������);
					is�����ѿ�ʼ = true;
				}
				else if (����Action.isAction�ѽ���())
				{
					if (!is�������Ƴ�)
					{
						��������.remove();
						��������.dispose();
						��ս��Ļ��.ʵ��.�����Ա(��ը����);
						is�������Ƴ� = true;
					}
					else if (��ը�ӳ�.isAction�ѽ���())
					{
						��ը����.remove();
						��ը����.dispose();
						return true;
					}
				}
			}
			return false;
		}
		@Override
		public void ��ʼ()
		{
			��ս��Ļ��.ʵ��.�����Ա(����ǰ�ӳ���Ա);
			��Ч.play();
		}
	}
	@Override
	public boolean �ͷ�(��ս�������� �з�����, ��ս��Ӣ���� �ͷŴ˼��ܵ�Ӣ��)
	{
		int �����˺� = (int) (�����˺� + �����˺���ռ����ǿ�ȱ��� * �ͷŴ˼��ܵ�Ӣ��.get��ս�з���ǿ��());
		int ����˺� = 0;
		boolean is���� = false;
		int ��ֵ��͸ = �ͷŴ˼��ܵ�Ӣ��.get��ս����ֵ���״�͸();
		float �ٷֱȴ�͸ = �ͷŴ˼��ܵ�Ӣ��.get��ս�аٷֱȻ��״�͸();
		float ������x = 0;
		float ������y = 0;
		int ���������� = 0;
		���������� �������� = new ����������();
		for (��ս��Ӣ���� ���� : �з�����.get���������С��ΧӢ������())
		{
			if (���� != null && !����.is����())
			{
				����������++;
				if (����.is�ҷ�())
				{
					������x += ��ս��Ļ��.�ҷ�X��������[����.getӢ������λ��()-1];
					������y += ��ս��Ļ��.�ҷ�Y��������[����.getӢ������λ��()-1];
				}
				else
				{
					������x += ��ս��Ļ��.�з�X��������[����.getӢ������λ��()-1];
					������y += ��ս��Ļ��.�з�Y��������[����.getӢ������λ��()-1];
				}
				����˺� += ����.�����ħ���˺�(�ͷŴ˼��ܵ�Ӣ��, �����˺�, ��ֵ��͸, �ٷֱȴ�͸, ��������);
				is���� = true;
			}
		}
		������x /= ����������;
		������y /= ����������;
		������װ����.ʵ��.�������(new �ͷ�������(������x, ������y, �ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���()));
		������װ����.ʵ��.�������(��������);
		if (is����)
		{
			�ͷŴ˼��ܵ�Ӣ��.������Ѫ(����˺�, true);
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
		return "B";
	}
}
