package edu.bjfu.lol.Ӣ��.���ƴ�ʦ;

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
import edu.bjfu.lol.��̬.������;
import edu.bjfu.lol.��̬.Ӣ����;

class ���˼����� extends ������
{
	private static final int ��һ���ͷŻغ��� = 3;
	private static final int �ͷż���غ��� = 15;
	private static final int ��������״̬�����غ��� = 2;
	private static final int ����������غ��� = 1;
	private static final String ������ = "����";
	private static final String �������� = String.format("%s  ��ʾ�з�����Ӣ�۵�λ��,����%d�غ�,�������ù����з����ŵ�\n����,����%d�غ�,���ᱻ����%d�غ�.",
			������
			,��������״̬�����غ���, ��������״̬�����غ���, ����������غ���);
	private static class ����״̬�� extends ��ս��Ӣ����.����״̬��
	{
		public ����״̬��()
		{
			super(��������״̬�����غ���);
		}
		@Override
		public String get״̬����()
		{
			return "���ˣ�����";
		}
	}
	public ���˼�����()
	{
		super(��һ���ͷŻغ���, �ͷż���غ���);
	}
	private class �ͷ������� extends ������
	{
		private float ������X;
		private float ������Y;
		private String Ӣ��Ƥ���ļ���;
		private boolean is����Ч;
		public �ͷ�������(float ������x, float ������y, String Ӣ��Ƥ���ļ���, boolean is����Ч)
		{
			������X = ������x;
			������Y = ������y;
			this.Ӣ��Ƥ���ļ��� = Ӣ��Ƥ���ļ���;
			this.is����Ч = is����Ч;
		}
		@Override
		protected ������ ���ɶ���()
		{
			return new �ͷŶ�����(������X, ������Y, Ӣ��Ƥ���ļ���, is����Ч);
		}
	}
	private class �ͷŶ����� extends ������
	{
		private �ӳ�Action �ӳ� = new �ӳ�Action(0.85f);
		private ������Ա�� ����;
		private Music ��Ч;
		private �ͷŶ�����(float ������X, float ������Y, String Ӣ��Ƥ���ļ���, boolean is����Ч)
		{
			ParticleEffect ����Ч�� = new ParticleEffect();
			����Ч��.load(Gdx.files.internal(������.����Ŀ¼ + "TwistedFateSkillR.p"), Ӣ����.getƤ����Դ(Ӣ��Ƥ���ļ���).getAtlas());
			���� = new ������Ա��(����Ч��);
			����.setPosition(������X, ������Y);
			����.addAction(�ӳ�);
			if (is����Ч)
			{
				��Ч = Gdx.audio.newMusic(Gdx.files.internal(������.����Ŀ¼ + "TwistedFateSkillR.mp3"));
				��Ч.setOnCompletionListener(new ���ֲ������Զ�������());
			}
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
			if (��Ч != null)
			{
				��Ч.play();
			}
		}
	}
	@Override
	public boolean �ͷ�(��ս�������� �з�����, ��ս��Ӣ���� �ͷŴ˼��ܵ�Ӣ��)
	{
		���������� �������� = new ����������();
		boolean is����Ч = true;
		for (��ս��Ӣ���� �з�Ӣ�� : �з�����.get��ս��Ӣ������())
		{
			if (�з�Ӣ�� != null && !�з�Ӣ��.is����())
			{
				��������.�������(new ״̬�ı���ʾ������(�з�Ӣ��.is�ҷ�(), �з�Ӣ��.getӢ������λ��(), "����", false));
				if (�з�Ӣ��.is�ҷ�())
				{
					��������.�������(new �ͷ�������(��ս��Ļ��.�ҷ�X��������[�з�Ӣ��.getӢ������λ��() - 1], ��ս��Ļ��.�ҷ�Y��������[�з�Ӣ��.getӢ������λ��() - 1], �ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���(), is����Ч));
				}
				else
				{
					��������.�������(new �ͷ�������(��ս��Ļ��.�з�X��������[�з�Ӣ��.getӢ������λ��() - 1], ��ս��Ļ��.�з�Y��������[�з�Ӣ��.getӢ������λ��() - 1], �ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���(), is����Ч));
				}
				�з�Ӣ��.�������״̬(new ����״̬��(), ��������);
				is����Ч = false;
			}
		}
		��������.�������(new ״̬�ı���ʾ������(�ͷŴ˼��ܵ�Ӣ��.is�ҷ�(), �ͷŴ˼��ܵ�Ӣ��.getӢ������λ��(), "��ù�����������", true));
		�ͷŴ˼��ܵ�Ӣ��.��ù�����������(��������״̬�����غ���);
		�ͷŴ˼��ܵ�Ӣ��.������(����������غ���, ��������);
		������װ����.ʵ��.�������(��������);
		������װ����.ʵ��.�������(new ״̬�ı���ʾ������(�ͷŴ˼��ܵ�Ӣ��.is�ҷ�(), �ͷŴ˼��ܵ�Ӣ��.getӢ������λ��(), "������", false));
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
		return "����";
	}
	@Override
	public String get�����ļ���׺()
	{
		return "D";
	}
	@Override
	public boolean is����()
	{
		return true;
	}
}
