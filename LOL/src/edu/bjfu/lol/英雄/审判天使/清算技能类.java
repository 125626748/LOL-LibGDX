package edu.bjfu.lol.Ӣ��.������ʹ;

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
import edu.bjfu.lol.scenes.scene2d.����.״̬�ı���ʾ������;
import edu.bjfu.lol.screen.��ս��Ļ��;
import edu.bjfu.lol.utils.������;
import edu.bjfu.lol.utils.���ֲ������Զ�������;
import edu.bjfu.lol.��̬.��ս��Ӣ����;
import edu.bjfu.lol.��̬.��ս��������;
import edu.bjfu.lol.��̬.״̬��;
import edu.bjfu.lol.Ӣ��.������ʹ.ʥ�漼����.ʥ��״̬��;
import edu.bjfu.lol.��̬.������;
import edu.bjfu.lol.��̬.Ӣ����;

class ���㼼���� extends ������
{
	private static final int ��һ���ͷŻغ��� = 1;
	private static final int �ͷż���غ��� = 4;
	private static final int ���ܻ����˺� = 60;
	private static final float ���ܸ����˺���ռ���������� = 1;
	private static final float ���ܸ����˺���ռ����ǿ�ȱ��� = 1;
	private static final float ����ֵ���Ͱٷֱ� = 35f / 100;
	private static final int ����ֵ���ͳ����غ��� = 2;
	private static final String ������ = "����";
	private static final String �������� = String.format("%s  ����һ��Ŀ��,���%d(+%.1f������)(+%.1f����ǿ��)ħ���˺�,��\n��Ŀ��%.0f%%����ֵ,����%d�غ�,��ʩ��һ��ʥ��Ч��.",
			������
			,���ܻ����˺�, ���ܸ����˺���ռ����������, ���ܸ����˺���ռ����ǿ�ȱ���, ����ֵ���Ͱٷֱ� * 100, ����ֵ���ͳ����غ���);
	private static class ����ֵ����״̬�� extends ״̬��
	{
		public ����ֵ����״̬��()
		{
			super(����ֵ���ͳ����غ���);
		}
		@Override
		public void ����(��ս��Ӣ���� ��״̬����Ӣ��)
		{
			��״̬����Ӣ��.�������ֵ�ٷֱȱ仯(-����ֵ���Ͱٷֱ�);
		}
		@Override
		public String get״̬����()
		{
			return "���㣬����ֵ����";
		}
	}
	public ���㼼����()
	{
		super(��һ���ͷŻغ���, �ͷż���غ���);
	}
	private class �ͷ������� extends ������
	{
		private float ������X;
		private float ������Y;
		private float ������X;
		private float ������Y;
		private String Ӣ��Ƥ���ļ���;
		public �ͷ�������(float ������x, float ������y, float ������x, float ������y, String Ӣ��Ƥ���ļ���)
		{
			������X = ������x;
			������Y = ������y;
			������X = ������x;
			������Y = ������y;
			this.Ӣ��Ƥ���ļ��� = Ӣ��Ƥ���ļ���;
		}
		@Override
		protected ������ ���ɶ���()
		{
			return new �ͷŶ�����(������X, ������Y, ������X, ������Y, Ӣ��Ƥ���ļ���);
		}
	}
	private class �ͷŶ����� extends ������
	{
		private �ӳ�Action �ӳ� = new �ӳ�Action(0.4f);
		private ������Ա�� ����;
		private Music ��Ч; 
		public �ͷŶ�����(float ������X, float ������Y, float ������X, float ������Y, String Ӣ��Ƥ���ļ���)
		{
			ParticleEffect ����Ч�� = new ParticleEffect();
			����Ч��.load(Gdx.files.internal(������.����Ŀ¼ + "KayleSkillQ.p"), Ӣ����.getƤ����Դ(Ӣ��Ƥ���ļ���).getAtlas());
			���� = new ������Ա��(����Ч��);
			����.setPosition(������X, ������Y);
			�����ƶ�Action �ƶ�Action = new �����ƶ�Action(������X, ������Y, 0.35f);
			����.addAction(Actions.sequence(�ƶ�Action, �ӳ�));
			��Ч = Gdx.audio.newMusic(Gdx.files.internal(������.����Ŀ¼ + "KayleSkillQ.mp3"));
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
	@Override
	public boolean �ͷ�(��ս�������� �з�����, ��ս��Ӣ���� �ͷŴ˼��ܵ�Ӣ��)
	{
		��ս��Ӣ���� ������Ӣ�� = �з�����.getĬ�ϱ�����Ӣ��(�ͷŴ˼��ܵ�Ӣ��);
		if (������Ӣ�� != null)
		{
			���������� �������� = new ����������();
			if (�ͷŴ˼��ܵ�Ӣ��.is�ҷ�())
			{
				��������.�������(new �ͷ�������(
						��ս��Ļ��.�ҷ�X��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1],
						��ս��Ļ��.�ҷ�Y��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1],
						��ս��Ļ��.�з�X��������[������Ӣ��.getӢ������λ��() - 1],
						��ս��Ļ��.�з�Y��������[������Ӣ��.getӢ������λ��() - 1], 
						�ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���()));
			}
			else
			{
				��������.�������(new �ͷ�������(
						��ս��Ļ��.�з�X��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1],
						��ս��Ļ��.�з�Y��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1],
						��ս��Ļ��.�ҷ�X��������[������Ӣ��.getӢ������λ��() - 1],
						��ս��Ļ��.�ҷ�Y��������[������Ӣ��.getӢ������λ��() - 1], 
						�ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���()));
			}
			��������.�������(new ״̬�ı���ʾ������(������Ӣ��.is�ҷ�(), ������Ӣ��.getӢ������λ��(), "����ֵ��,˫����", false));
			������Ӣ��.�������ֵ����״̬(new ����ֵ����״̬��());
			ʥ��״̬��.ʩ��ʥ��Ч��(������Ӣ��, ��������);
			������װ����.ʵ��.�������(��������);
			int ����˺� = ������Ӣ��.�����ħ���˺�(�ͷŴ˼��ܵ�Ӣ��, (int) (���ܻ����˺� + �ͷŴ˼��ܵ�Ӣ��.get��ս�й�����() * ���ܸ����˺���ռ���������� + �ͷŴ˼��ܵ�Ӣ��.get��ս�з���ǿ��() * ���ܸ����˺���ռ����ǿ�ȱ���), �ͷŴ˼��ܵ�Ӣ��.get��ս����ֵ������͸(), �ͷŴ˼��ܵ�Ӣ��.get��ս�аٷֱȷ�����͸(), null);
			�ͷŴ˼��ܵ�Ӣ��.������Ѫ(����˺�, false);
			return true;
		}
		else
		{
			return false;
		}
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
