package edu.bjfu.lol.Ӣ��.��Ѫ����;

import java.util.LinkedList;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.g2d.ParticleEffect;
import com.badlogic.gdx.math.Vector2;

import edu.bjfu.lol.scenes.scene2d.actions.�ӳ�Action;
import edu.bjfu.lol.scenes.scene2d.ui.������Ա��;
import edu.bjfu.lol.scenes.scene2d.����.������;
import edu.bjfu.lol.scenes.scene2d.����.������;
import edu.bjfu.lol.scenes.scene2d.����.������װ����;
import edu.bjfu.lol.scenes.scene2d.����.����������;
import edu.bjfu.lol.scenes.scene2d.����.״̬�ı���ʾ������;
import edu.bjfu.lol.screen.��ս��Ļ��;
import edu.bjfu.lol.screen.��ս��Ļ��.Ӣ��������;
import edu.bjfu.lol.utils.������;
import edu.bjfu.lol.utils.���ֲ������Զ�������;
import edu.bjfu.lol.��̬.��ս��Ӣ����;
import edu.bjfu.lol.��̬.��ս��Ӣ����.�з�����״̬������Ӣ��״̬��;
import edu.bjfu.lol.��̬.��ս��Ӣ����.����״̬��;
import edu.bjfu.lol.��̬.��ս��������;
import edu.bjfu.lol.��̬.״̬��;
import edu.bjfu.lol.��̬.������;
import edu.bjfu.lol.��̬.Ӣ����;

class Ѫ��׷�ټ����� extends ������
{
	private static final float ����ֵ���ڰٷֱ� = 50f / 100;
	private static final float ����ֵ���Ӱٷֱ� = 20f / 100;
	private static final int ״̬�����غ��� = 2;
	private static final String ������ = "Ѫ��׷��";
	private static final String �������� = String.format("%s  ������ܹ���֪�з�����ֵ����%.0f%%�ĵз�Ӣ�۵�����.����\n����Ӣ�ۺ�,���������%.0f%%������ֵ,����%d�غ�.",
			������, ����ֵ���ڰٷֱ� * 100, ����ֵ���Ӱٷֱ� * 100, ״̬�����غ���);
	private static class Ѫ��׷��״̬�� extends �з�����״̬������Ӣ��״̬��
	{
		private static class ����ֵ����״̬�� extends ״̬��
		{
			public ����ֵ����״̬��()
			{
				super(״̬�����غ���);
			}
			@Override
			public void ����(��ս��Ӣ���� ��״̬����Ӣ��)
			{
				��״̬����Ӣ��.�������ֵ�ٷֱȱ仯(����ֵ���Ӱٷֱ�);
			}
			@Override
			public String get״̬����()
			{
				return "�з�Ӣ������ֵ�ͣ����������ֵ����";
			}
		}
		private static class ����Ӣ������״̬�� extends ����״̬��
		{
			public ����Ӣ������״̬��()
			{
				super(״̬�����غ���);
			}
			@Override
			public String get״̬����()
			{
				return "������������˷���";
			}
		}
		public Ѫ��׷��״̬��()
		{
			super(Integer.MAX_VALUE);
		}
		@Override
		public String get״̬����()
		{
			return ��������;
		}
		private class ������������ extends ������
		{
			private String Ӣ��Ƥ���ļ���;
			private LinkedList<Vector2> λ������ = new LinkedList<Vector2>();
			public ������������(String Ӣ��Ƥ���ļ���, LinkedList<��ս��Ӣ����> ������Ӣ������)
			{
				this.Ӣ��Ƥ���ļ��� = Ӣ��Ƥ���ļ���;
				for (��ս��Ӣ���� Ӣ�� : ������Ӣ������)
				{
					if (Ӣ��.is�ҷ�())
					{
						λ������.add(new Vector2(��ս��Ļ��.�ҷ�X��������[Ӣ��.getӢ������λ��()-1], ��ս��Ļ��.�ҷ�Y��������[Ӣ��.getӢ������λ��()-1]));
					}
					else
					{
						λ������.add(new Vector2(��ս��Ļ��.�з�X��������[Ӣ��.getӢ������λ��()-1], ��ս��Ļ��.�з�Y��������[Ӣ��.getӢ������λ��()-1]));
					}
				}
			}
			@Override
			protected ������ ���ɶ���()
			{
				return new �����ֶ�����(λ������, Ӣ��Ƥ���ļ���);
			}
		}
		private class �����ֶ����� extends ������
		{
			private �ӳ�Action �ӳ� = new �ӳ�Action(1);
			private ������Ա��[] ��������;
			private �����ֶ�����(LinkedList<Vector2> λ������, String Ӣ��Ƥ���ļ���)
			{
				�������� = new ������Ա��[λ������.size()];
				ParticleEffect ����Ч�� = new ParticleEffect();
				����Ч��.load(Gdx.files.internal(������.����Ŀ¼ + "WarwickSkillE.p"), Ӣ����.getƤ����Դ(Ӣ��Ƥ���ļ���).getAtlas());
				for (int i = 0; i < ��������.length; i++)
				{
					��������[i] = new ������Ա��(����Ч��);
					Vector2 λ�� = λ������.get(i);
					��������[i].setPosition(λ��.x, λ��.y);
				}
				��������[0].addAction(�ӳ�);
			}
			@Override
			public boolean is���()
			{
				if (�ӳ�.isAction�ѽ���())
				{
					for (������Ա�� ���� : ��������)
					{
						����.remove();
					}
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
				for (������Ա�� ���� : ��������)
				{
					��ս��Ļ��.ʵ��.�����Ա(����);
				}
			}
		}
		private class �ͷ������� extends ������
		{
			private boolean is�ҷ�;
			private int Ӣ������λ��;
			public �ͷ�������(boolean is�ҷ�, int Ӣ������λ��)
			{
				this.is�ҷ� = is�ҷ�;
				this.Ӣ������λ�� = Ӣ������λ��;
			}
			@Override
			protected ������ ���ɶ���()
			{
				return new �ͷŶ�����(is�ҷ�, Ӣ������λ��);
			}
		}
		private class �ͷŶ����� extends ������
		{
			private �ӳ�Action �ӳ� = new �ӳ�Action(1);
			private Ӣ�������� Ӣ������;
			private Music ��Ч;
			private �ͷŶ�����(boolean is�ҷ�, int Ӣ������λ��)
			{
				this.Ӣ������ = ��ս��Ļ��.ʵ��.getӢ������(is�ҷ�, Ӣ������λ��);
				��Ч = Gdx.audio.newMusic(Gdx.files.internal(������.����Ŀ¼ + "WarwickSkillE.mp3"));
				��Ч.setOnCompletionListener(new ���ֲ������Զ�������());
			}
			@Override
			public boolean is���()
			{
				if (�ӳ�.isAction�ѽ���())
				{
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
				Ӣ������.addAction(�ӳ�);
				��Ч.play();
			}
		}
		@Override
		public void ��֪ͨ�з�����״̬(��ս��Ӣ���� ��֪ͨӢ��, ��ս�������� �з�����)
		{
			boolean ���µĵ������� = false;
			boolean ���ڵ������� = false;
			���������� �������� = new ����������();
			LinkedList<��ս��Ӣ����> ������Ӣ������ = new LinkedList<��ս��Ӣ����>();
			for (��ս��Ӣ���� �з�Ӣ�� : �з�����.get��ս��Ӣ������())
			{
				if (�з�Ӣ�� != null && !�з�Ӣ��.is����())
				{
					if (�з�Ӣ��.get��ս������ֵ() * 1.0f / �з�Ӣ��.get��ս���������ֵ() < ����ֵ���ڰٷֱ�)
					{
						���ڵ������� = true;
						״̬�� ����״̬ = �з�Ӣ��.get����״̬(����Ӣ������״̬��.class);
						if (����״̬ == null)
						{
							�з�Ӣ��.�������״̬(new ����Ӣ������״̬��(), ��������);	
							������Ӣ������.add(�з�Ӣ��);
							���µĵ������� = true;
						}
						else
						{
							����״̬.����״̬�غ���();
						}
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
					else
					{
						�з�Ӣ��.�Ƴ�����״̬(����Ӣ������״̬��.class, ��������);
					}
				}
			}
			if (!���ڵ�������)
			{
				��֪ͨӢ��.�Ƴ�����ֵ����״̬(����ֵ����״̬��.class);
			}
			if (���µĵ�������)
			{
				��������.�������(new ������������(��֪ͨӢ��.getӢ��().getӢ��Ƥ���ļ���(), ������Ӣ������));
				��������.�������(new �ͷ�������(��֪ͨӢ��.is�ҷ�(), ��֪ͨӢ��.getӢ������λ��()));
				��������.�������(new ״̬�ı���ʾ������(��֪ͨӢ��.is�ҷ�(), ��֪ͨӢ��.getӢ������λ��(), "����ֵ����", true));
				������װ����.ʵ��.�������(��������);
			}
		}
	}
	public Ѫ��׷�ټ�����()
	{
		super(Integer.MAX_VALUE, Integer.MAX_VALUE);
	}
	@Override
	public void ��ӱ���״̬(��ս��Ӣ���� ��ս��Ӣ��)
	{
		��ս��Ӣ��.��ӵз�����״̬������Ӣ��״̬(new Ѫ��׷��״̬��());
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
		return "D";
	}
}
