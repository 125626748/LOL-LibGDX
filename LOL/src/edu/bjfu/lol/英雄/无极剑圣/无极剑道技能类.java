package edu.bjfu.lol.Ӣ��.�޼���ʥ;

import java.util.Iterator;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.g2d.ParticleEffect;

import edu.bjfu.lol.scenes.scene2d.actions.�ӳ�Action;
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
import edu.bjfu.lol.��̬.��ս��Ӣ����.��ͨ��������Ч��״̬��;
import edu.bjfu.lol.��̬.��ս��������;
import edu.bjfu.lol.��̬.״̬��;
import edu.bjfu.lol.��̬.������;
import edu.bjfu.lol.��̬.Ӣ����;

class �޼����������� extends ������
{
	private static final int ��һ���ͷŻغ��� = 1;
	private static final int �ͷż���غ��� = 6;
	private static final float �������ӹ������ٷֱ� = 0.1f;
	private static final int ����������ʵ�˺� = 10;
	private static final float ����������ʵ�˺���ռ���������� = 0.1f;
	private static final int ���������غ��� = 3;
	private static final String ������ = "�޼�����";
	private static final String �������� = String.format("%s  �޼�����,����:����%.0f%%������.����:��ͨ������ɶ����\n%d(+%.1f��������ʵ�˺�),����%d�غ�,������Ч��������,ֱ���ü�����\n����ȴ�ڼ�,����Ч����Ч.",
			������
			,�������ӹ������ٷֱ� * 100, ����������ʵ�˺�, ����������ʵ�˺���ռ����������, ���������غ���);
	private class ��ͨ����������ʵ�˺�״̬�� extends ��ͨ��������Ч��״̬��
	{
		public ��ͨ����������ʵ�˺�״̬��()
		{
			super(���������غ���);
		}
		@Override
		public void ��ͨ����(��ս��Ӣ���� ������, ��ս��Ӣ���� ��������, Iterator<��ͨ��������Ч��״̬��> ������)
		{
			int ��ʵ�˺� = (int) (����������ʵ�˺� + ������.get��ս�й�����() * ����������ʵ�˺���ռ����������);
			if (!��������.is����())
			{
				Gdx.app.debug("�޼�����������.��ͨ����������ʵ�˺�״̬��.��ͨ����", String.format("%s�޼������������ʵ�˺�\n", ������.get����������λ��Ӣ������()));
				������װ����.ʵ��.�������(new ״̬�ı���ʾ������(������.is�ҷ�(), ������.getӢ������λ��(), "�޼�������ʵ�˺�", true));
				��������.�������ʵ�˺�(������, ��ʵ�˺�, null);
			}
		}
		@Override
		public String get״̬����()
		{
			return "�޼���������ͨ������ɶ�����ʵ�˺�";
		}
	}
	private class �������ӹ�����״̬�� extends ״̬��
	{
		public �������ӹ�����״̬��()
		{
			super(Integer.MAX_VALUE);
		}
		@Override
		public void ����(��ս��Ӣ���� ��״̬����Ӣ��)
		{
			if (��״̬����Ӣ��.get��ͨ��������Ч��״̬(��ͨ����������ʵ�˺�״̬��.class) != null)
			{
				��״̬����Ӣ��.��ӹ������ٷֱȱ仯(�������ӹ������ٷֱ�);
			}
		}
		@Override
		public String get״̬����()
		{
			return "�޼��������������ӹ�����";
		}
	}
	public �޼�����������()
	{
		super(��һ���ͷŻغ���, �ͷż���غ���);
	}
	private class �����޼����������� extends ������
	{
		private float ������X;
		private float ������Y;
		private String Ӣ��Ƥ���ļ���;
		public �����޼�����������(float ������x, float ������y, String Ӣ��Ƥ���ļ���)
		{
			������X = ������x;
			������Y = ������y;
			this.Ӣ��Ƥ���ļ��� = Ӣ��Ƥ���ļ���;
		}
		@Override
		protected ������ ���ɶ���()
		{
			return new �����޼�����������(������X, ������Y, Ӣ��Ƥ���ļ���);
		}
	}
	private class �����޼����������� extends ������
	{
		private �ӳ�Action �ӳ� = new �ӳ�Action(0.8f);
		private ������Ա�� ����;
		private Music ��Ч;
		private �����޼�����������(float ������X, float ������Y, String Ӣ��Ƥ���ļ���)
		{
			ParticleEffect ����Ч�� = new ParticleEffect();
			����Ч��.load(Gdx.files.internal(������.����Ŀ¼ + "MasterYiSkillE.p"), Ӣ����.getƤ����Դ(Ӣ��Ƥ���ļ���).getAtlas());
			���� = new ������Ա��(����Ч��);
			����.setPosition(������X, ������Y);
			����.addAction(�ӳ�);
			��Ч = Gdx.audio.newMusic(Gdx.files.internal(������.����Ŀ¼ + "MasterYiSkillE.mp3"));
			��Ч.setOnCompletionListener(new ���ֲ������Զ�������());
		}
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
		���������� �������� = new ����������();
		��������.�������(new ״̬�ı���ʾ������(�ͷŴ˼��ܵ�Ӣ��.is�ҷ�(), �ͷŴ˼��ܵ�Ӣ��.getӢ������λ��(), "�չ�������ʵ�˺�", true));
		if (�ͷŴ˼��ܵ�Ӣ��.is�ҷ�())
		{
			��������.�������(new �����޼�����������(��ս��Ļ��.�ҷ�X��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��()-1], ��ս��Ļ��.�ҷ�Y��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��()-1], �ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���()));
		}
		else
		{
			��������.�������(new �����޼�����������(��ս��Ļ��.�з�X��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��()-1], ��ս��Ļ��.�з�Y��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��()-1], �ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���()));
		}
		������װ����.ʵ��.�������(��������);
		�ͷŴ˼��ܵ�Ӣ��.�����ͨ��������Ч��״̬(new ��ͨ����������ʵ�˺�״̬��());
		return true;
	}
	@Override
	public String get��������()
	{
		return ��������;
	}
	public void ��ӱ���״̬(��ս��Ӣ���� ��ս��Ӣ��)
	{
		��ս��Ӣ��.��ӹ���������״̬(new �������ӹ�����״̬��());
	}
	@Override
	public String get������()
	{
		return ������;
	}
	@Override
	public String get�����ļ���׺()
	{
		return "D";
	}
}