package edu.bjfu.lol.Ӣ��.��������;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;

import edu.bjfu.lol.scenes.scene2d.����.������;
import edu.bjfu.lol.scenes.scene2d.����.������;
import edu.bjfu.lol.scenes.scene2d.����.������װ����;
import edu.bjfu.lol.scenes.scene2d.����.����������;
import edu.bjfu.lol.scenes.scene2d.����.״̬�ı���ʾ������;
import edu.bjfu.lol.utils.������;
import edu.bjfu.lol.utils.���ֲ������Զ�������;
import edu.bjfu.lol.��̬.��ս��Ӣ����;
import edu.bjfu.lol.��̬.��ս��Ӣ����.�з�����״̬������Ӣ��״̬��;
import edu.bjfu.lol.��̬.��ս��������;
import edu.bjfu.lol.��̬.״̬��;
import edu.bjfu.lol.��̬.������;

class ����м����� extends ������
{
	private static final float ����ֵ�����ٷֱ� = 50f / 100;
	private static final int �����غ��� = 2;
	private static final String ������ = "�����";
	private static final String �������� = String.format("%s  �ڵ��˱���ɱ��,���˿������ֵ������%.0f%%,����%d�غ�.", ������, ����ֵ�����ٷֱ� * 100, �����غ���);
	private static class �����״̬�� extends �з�����״̬������Ӣ��״̬��
	{
		private static class ����ֵ����״̬�� extends ״̬��
		{
			public ����ֵ����״̬��() 
			{
				super(�����غ���);
			}
			@Override
			public void ����(��ս��Ӣ���� ��״̬����Ӣ��)
			{
				��״̬����Ӣ��.�������ֵ�ٷֱȱ仯(����ֵ�����ٷֱ�);
			}
			@Override
			public String get״̬����()
			{
				return "�ڵ��˻�ɱ�󣬽��˿������ֵ��õ���������";
			}
		}
		public �����״̬��()
		{
			super(Integer.MAX_VALUE);
		}
		@Override
		public String get״̬����()
		{
			return ��������;
		}
		private class �ͷ������� extends ������
		{
			@Override
			protected ������ ���ɶ���()
			{
				return new �ͷŶ�����();
			}
		}
		private class �ͷŶ����� extends ������
		{
			private Music ��Ч;
			public �ͷŶ�����()
			{
				��Ч = Gdx.audio.newMusic(Gdx.files.internal(������.����Ŀ¼ + "JinxSkillPassive.mp3"));
				��Ч.setOnCompletionListener(new ���ֲ������Զ�������());
			}
			@Override
			public void ��ʼ()
			{
				��Ч.play();
			}
		}
		@Override
		public void ��֪ͨ�з�����״̬(��ս��Ӣ���� ��֪ͨӢ��, ��ս�������� �з�����)
		{
			���������� �������� = new ����������();
			��������.�������(new �ͷ�������());
			��������.�������(new ״̬�ı���ʾ������(��֪ͨӢ��.is�ҷ�(), ��֪ͨӢ��.getӢ������λ��(), "�����", true));
			������װ����.ʵ��.�������(��������);
			״̬�� ����ֵ����״̬ = ��֪ͨӢ��.get����ֵ����״̬(����ֵ����״̬��.class);
			if (����ֵ����״̬ == null)
			{
				��֪ͨӢ��.�������ֵ����״̬(new ����ֵ����״̬��());
			}
			else
			{
				����ֵ����״̬.����״̬�غ���();
			}
		}
	}
	public ����м�����()
	{
		super(Integer.MAX_VALUE, Integer.MAX_VALUE);
	}
	@Override
	public void ��ӱ���״̬(��ս��Ӣ���� ��ս��Ӣ��)
	{
		��ս��Ӣ��.��ӵз���Ӣ����������״̬(new �����״̬��());
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
		return "A";
	}
}
