package edu.bjfu.lol.Ӣ��.�޼���ʥ;

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
import edu.bjfu.lol.��̬.��ս��������;
import edu.bjfu.lol.��̬.״̬��;
import edu.bjfu.lol.�߼�.������;
import edu.bjfu.lol.��̬.������;
import edu.bjfu.lol.��̬.Ӣ����;

class ڤ�뼼���� extends ������
{
	private static final int ��һ���ͷŻغ��� = 4;
	private static final int �ͷż���غ��� = 8;
	private static final int ʩ�������غ��� = 2;
	private static final int ���ܻ����ظ�����ֵ = 30;
	private static final float ���ܸ��ӻظ�����ֵ��ռ����ǿ�ȱ��� = 0.3f;
	private static final float ����ÿʧȥ����ֵ�ٷֱ� = 0.01f;
	private static final float ��������Ч�������ٷֱ� = 0.01f;
	private static final float �����˺����Ͱٷֱ� = 0.5f;
	private static final String ������ = "ڤ��";
	private static final String �������� = String.format("%s  �״�ʦ��ʼ����,��%d�غ���ÿ�غϻظ�%d(+%.1f����ǿ��)����ֵ,\n�״�ʦÿʧȥ%.1f%%����ֵ,�������Ч���ͻ�����%.1f%%.����ʱ,�״�ʦ\n���ܵ��˺��ή��%.0f%%.",
			������
			,ʩ�������غ���, ���ܻ����ظ�����ֵ, ���ܸ��ӻظ�����ֵ��ռ����ǿ�ȱ���, ����ÿʧȥ����ֵ�ٷֱ� * 100, ��������Ч�������ٷֱ� * 100, �����˺����Ͱٷֱ� * 100);
	private class ڤ��״̬�� extends ��ս��Ӣ����.��������ʩ��״̬�� 
	{
		public ڤ��״̬��(int �������غ���)
		{
			super(�������غ���);
		}
		@Override
		public void ����ʩ��(��ս�������� �з�����, ��ս��Ӣ���� �ͷŴ˼��ܵ�Ӣ��)
		{
			super.����ʩ��(�з�����, �ͷŴ˼��ܵ�Ӣ��);
			ڤ�뼼����.ʩ��(�з�����, �ͷŴ˼��ܵ�Ӣ��);
		}
		@Override
		public String get״̬����()
		{	
			return "ڤ�룬ÿ�غϻظ�����ֵ";
		}
		@Override
		protected void ��֪ͨ�����(��ս��Ӣ���� �����Ӣ��)
		{
			Gdx.app.debug("ڤ�뼼����.ڤ��״̬��.��֪ͨ�����", String.format("%sڤ��״̬�����\n", �����Ӣ��.get����������λ��Ӣ������()));
			�����Ӣ��.�Ƴ��˺�����״̬(�˺�����״̬��.class);
		}
	}
	private static class �˺�����״̬�� extends ״̬��
	{
		public �˺�����״̬��()
		{
			super(ʩ�������غ���);
		}
		@Override
		public void ����(��ս��Ӣ���� ��״̬����Ӣ��)
		{
			��״̬����Ӣ��.����˺��ٷֱȼ���(�����˺����Ͱٷֱ�);
		}
		@Override
		public String get״̬����()
		{
			return "ڤ�룬�״�ʦ���ܵ��˺�����";
		}
	}
	public ڤ�뼼����()
	{
		super(��һ���ͷŻغ���, �ͷż���غ���);
	}
	private class ����ڤ�������� extends ������
	{
		private float ������X;
		private float ������Y;
		private String Ӣ��Ƥ���ļ���;
		public ����ڤ��������(float ������x, float ������y, String Ӣ��Ƥ���ļ���)
		{
			������X = ������x;
			������Y = ������y;
			this.Ӣ��Ƥ���ļ��� = Ӣ��Ƥ���ļ���;
		}
		@Override
		protected ������ ���ɶ���()
		{
			return new ����ڤ�붯����(������X, ������Y, Ӣ��Ƥ���ļ���);
		}
	}
	private class ����ڤ�붯���� extends ������
	{
		private �ӳ�Action �ӳ� = new �ӳ�Action(1f);
		private ������Ա�� ����;
		private Music ��Ч;
		private ����ڤ�붯����(float ������X, float ������Y, String Ӣ��Ƥ���ļ���)
		{
			ParticleEffect ����Ч�� = new ParticleEffect();
			����Ч��.load(Gdx.files.internal(������.����Ŀ¼ + "MasterYiSkillW.p"), Ӣ����.getƤ����Դ(Ӣ��Ƥ���ļ���).getAtlas());
			���� = new ������Ա��(����Ч��);
			����.setPosition(������X, ������Y);
			����.addAction(�ӳ�);
			��Ч = Gdx.audio.newMusic(Gdx.files.internal(������.����Ŀ¼ + "MasterYiSkillW.mp3"));
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
		�ͷŴ˼��ܵ�Ӣ��.������������ʩ��״̬(new ڤ��״̬��(ʩ�������غ���));
		���������� �������� = new ����������();
		if (�ͷŴ˼��ܵ�Ӣ��.is�ҷ�())
		{
			��������.�������(new ����ڤ��������(��ս��Ļ��.�ҷ�X��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��()-1], ��ս��Ļ��.�ҷ�Y��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��()-1], �ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���()));
		}
		else
		{
			��������.�������(new ����ڤ��������(��ս��Ļ��.�з�X��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��()-1], ��ս��Ļ��.�з�Y��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��()-1], �ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���()));
		}
		��������.�������(new ״̬�ı���ʾ������(�ͷŴ˼��ܵ�Ӣ��.is�ҷ�(), �ͷŴ˼��ܵ�Ӣ��.getӢ������λ��(), "�˺�����", true));
		������װ����.ʵ��.�������(��������);
		ڤ�뼼����.ʩ��(�з�����, �ͷŴ˼��ܵ�Ӣ��);
		�ͷŴ˼��ܵ�Ӣ��.����˺�����״̬(new �˺�����״̬��());
		return true;
	}
	@Override
	public String get��������()
	{
		return ��������;
	}
	private static void ʩ��(��ս�������� �з�����, ��ս��Ӣ���� �ͷŴ˼��ܵ�Ӣ��)
	{
		int ����Ч��ֵ = ���ܻ����ظ�����ֵ;
		����Ч��ֵ += �ͷŴ˼��ܵ�Ӣ��.get��ս�з���ǿ��() * ���ܸ��ӻظ�����ֵ��ռ����ǿ�ȱ���;
		int ����ֵ = �ͷŴ˼��ܵ�Ӣ��.get��ս������ֵ();
		int �������ֵ = �ͷŴ˼��ܵ�Ӣ��.get��ս���������ֵ();
		float ʧȥ����ֵ�ٷֱ� = (�������ֵ - ����ֵ) * 1.0f / �������ֵ;
		int ʧȥ���ܼ���ʧȥ����ֵ�ٷֱ����� = (int)(ʧȥ����ֵ�ٷֱ� / ����ÿʧȥ����ֵ�ٷֱ�);
		float Ч�������ٷֱ� = ��������Ч�������ٷֱ� * ʧȥ���ܼ���ʧȥ����ֵ�ٷֱ�����;
		����Ч��ֵ = ������.����_�ٷֱȱ仯_����ֵ(����Ч��ֵ, Ч�������ٷֱ�);
		���������� �������� = new ����������();
		��������.�������(new ״̬�ı���ʾ������(�ͷŴ˼��ܵ�Ӣ��.is�ҷ�(), �ͷŴ˼��ܵ�Ӣ��.getӢ������λ��(), "ڤ��", true));
		�ͷŴ˼��ܵ�Ӣ��.��������ֵ(����Ч��ֵ, ��������);
		������װ����.ʵ��.�������(��������);
	}
	@Override
	public String get������()
	{
		return ������;
	}
	@Override
	public String get�����ļ���׺()
	{
		return "C";
	}
}
