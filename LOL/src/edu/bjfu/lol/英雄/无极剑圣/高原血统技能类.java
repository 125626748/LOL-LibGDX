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
import edu.bjfu.lol.��̬.��ս�м�����;
import edu.bjfu.lol.��̬.��ս��Ӣ����;
import edu.bjfu.lol.��̬.��ս��Ӣ����.����ֵ��������״̬��;
import edu.bjfu.lol.��̬.��ս��������;
import edu.bjfu.lol.��̬.״̬��;
import edu.bjfu.lol.��̬.������;
import edu.bjfu.lol.��̬.Ӣ����;

class ��ԭѪͳ������ extends ������
{
	private static final int ��һ���ͷŻغ��� = 3;
	private static final int �ͷż���غ��� = 8;
	private static final int ������ȴ���ٻغ��� = 1;
	private static final float ����ֵ��߰ٷֱ� = 0.25f;
	private static final float �����ٶ���߰ٷֱ� = 0.3f;
	private static final int ���ܳ����غ��� = 2;
	private static final int �����ӳ��غ��� = 1;
	private static final String ������ = "��ԭѪͳ";
	private static final String �������� = String.format("%s  ����:һλ����������ʹ�״�ʦ����ͨ������ȴ����%d�غ�,��\n��:����ֵ���%.0f%%,�����ٶ����%.0f%%,������������ֵ����Ч��,����\n%d�غ�,�ڼ���ʱһλ����������ʹ�״�ʦ�ĸ�ԭѪͳ����ʱ���ӳ�%d�غ�.",
			������
			,������ȴ���ٻغ���, ����ֵ��߰ٷֱ� * 100, �����ٶ���߰ٷֱ� * 100, ���ܳ����غ���, �����ӳ��غ���);
	private static class ����������������Ч��״̬�� extends ״̬��
	{
		private static final String ״̬���� = String.format("��ԭѪͳ���ڼ���ʱһλ����������ʹ�״�ʦ�ĸ�ԭѪͳ����ʱ���ӳ�%d�غϡ�", �����ӳ��غ���);
		public ����������������Ч��״̬��()
		{
			super(���ܳ����غ���);
		}
		@Override
		public void ����(��ս��Ӣ���� ��״̬����Ӣ��)
		{
			������װ����.ʵ��.�������(new ״̬�ı���ʾ������(��״̬����Ӣ��.is�ҷ�(), ��״̬����Ӣ��.getӢ������λ��(), "��ԭѪͳ�ӳ�", true));
			��״̬����Ӣ��.get����ֵ����״̬(��������ֵ״̬��.class).״̬�ӳ�(�����ӳ��غ���);
			��״̬����Ӣ��.get�����ٶ�����״̬(���������ٶ�״̬��.class).״̬�ӳ�(�����ӳ��غ���);
			��״̬����Ӣ��.get����ֵ��������״̬(������������ֵ����Ч��״̬��.class).״̬�ӳ�(�����ӳ��غ���);
			����������������Ч��״̬��.this.״̬�ӳ�(�����ӳ��غ���);
		}
		@Override
		public String get״̬����()
		{
			return ״̬����;
		}
	}
	private static class ������������ֵ����Ч��״̬�� extends ����ֵ��������״̬��
	{
		public ������������ֵ����Ч��״̬��()
		{
			super(���ܳ����غ���);
		}
		@Override
		public String get״̬����()
		{
			return "��ԭѪͳ����������ֵ����Ч��";
		}
	}
	private class ���������ٶ�״̬�� extends ״̬��
	{
		public ���������ٶ�״̬��()
		{
			super(���ܳ����غ���);
		}
		@Override
		public void ����(��ս��Ӣ���� ��״̬����Ӣ��)
		{
			��״̬����Ӣ��.��ӹ����ٶȰٷֱȱ仯(�����ٶ���߰ٷֱ�);
		}
		@Override
		public String get״̬����()
		{
			return "��ԭѪͳ�������ٶ����";
		}
	}
	private class ��������ֵ״̬�� extends ״̬��
	{
		public ��������ֵ״̬��()
		{
			super(���ܳ����غ���);
		}
		@Override
		public void ����(��ս��Ӣ���� ��״̬����Ӣ��)
		{
			��״̬����Ӣ��.�������ֵ�ٷֱȱ仯(����ֵ��߰ٷֱ�);
		}
		@Override
		public String get״̬����()
		{
			return "��ԭѪͳ������ֵ���";
		}
	}
	private static class ��ԭѪͳ����״̬�� extends ״̬��
	{
		private static final String ״̬���� = String.format("��ԭѪͳ��һλ����������ʹ�״�ʦ����ͨ������ȴ����%d�غϡ�", ������ȴ���ٻغ���);
		public ��ԭѪͳ����״̬��()
		{
			super(Integer.MAX_VALUE);
		}
		@Override
		public void ����(��ս��Ӣ���� ��״̬����Ӣ��)
		{
			������װ����.ʵ��.�������(new ״̬�ı���ʾ������(��״̬����Ӣ��.is�ҷ�(), ��״̬����Ӣ��.getӢ������λ��(), "��ͨ������ȴ����", true));
			��ս�м�����[] ��ս�м������� = ��״̬����Ӣ��.get��ս�м�������();
			for (int i = 0; i < ��ս�м�������.length; i++)
			{
				��ս�м�������[i].���ټ�����ȴ�غ���(������ȴ���ٻغ���);
			}
		}
		@Override
		public String get״̬����()
		{
			return ״̬����;
		}
	}
	public ��ԭѪͳ������()
	{
		super(��һ���ͷŻغ���, �ͷż���غ���);
	}
	private class ������ԭѪͳ������ extends ������
	{
		private float ������X;
		private float ������Y;
		private String Ӣ��Ƥ���ļ���;
		public ������ԭѪͳ������(float ������x, float ������y, String Ӣ��Ƥ���ļ���)
		{
			������X = ������x;
			������Y = ������y;
			this.Ӣ��Ƥ���ļ��� = Ӣ��Ƥ���ļ���;
		}
		@Override
		protected ������ ���ɶ���()
		{
			return new ������ԭѪͳ������(������X, ������Y, Ӣ��Ƥ���ļ���);
		}
	}
	private class ������ԭѪͳ������ extends ������
	{
		private �ӳ�Action �ӳ� = new �ӳ�Action(0.8f);
		private ������Ա�� ����;
		private Music ��Ч;
		private ������ԭѪͳ������(float ������X, float ������Y, String Ӣ��Ƥ���ļ���)
		{
			ParticleEffect ����Ч�� = new ParticleEffect();
			����Ч��.load(Gdx.files.internal(������.����Ŀ¼ + "MasterYiSkillR.p"), Ӣ����.getƤ����Դ(Ӣ��Ƥ���ļ���).getAtlas());
			���� = new ������Ա��(����Ч��);
			����.setPosition(������X, ������Y);
			����.addAction(�ӳ�);
			��Ч = Gdx.audio.newMusic(Gdx.files.internal(������.����Ŀ¼ + "MasterYiSkillR.mp3"));
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
		��������.�������(new ״̬�ı���ʾ������(�ͷŴ˼��ܵ�Ӣ��.is�ҷ�(), �ͷŴ˼��ܵ�Ӣ��.getӢ������λ��(), "����ֵ��,���١�,����ֵ��������", true));
		if (�ͷŴ˼��ܵ�Ӣ��.is�ҷ�())
		{
			��������.�������(new ������ԭѪͳ������(��ս��Ļ��.�ҷ�X��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��()-1], ��ս��Ļ��.�ҷ�Y��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��()-1], �ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���()));
		}
		else
		{
			��������.�������(new ������ԭѪͳ������(��ս��Ļ��.�з�X��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��()-1], ��ս��Ļ��.�з�Y��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��()-1], �ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���()));
		}
		������װ����.ʵ��.�������(��������);
		�ͷŴ˼��ܵ�Ӣ��.�������ֵ����״̬(new ��������ֵ״̬��());
		�ͷŴ˼��ܵ�Ӣ��.��ӹ����ٶ�����״̬(new ���������ٶ�״̬��());
		�ͷŴ˼��ܵ�Ӣ��.�������ֵ��������״̬(new ������������ֵ����Ч��״̬��());
		�ͷŴ˼��ܵ�Ӣ��.��ӵз���Ӣ����������״̬(new ����������������Ч��״̬��());
		return true;
	}
	@Override
	public void ��ӱ���״̬(��ս��Ӣ���� ��ս��Ӣ��)
	{
		��ս��Ӣ��.��ӵз���Ӣ����������״̬(new ��ԭѪͳ����״̬��());
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
