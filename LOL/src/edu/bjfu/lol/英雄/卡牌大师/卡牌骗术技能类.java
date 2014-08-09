package edu.bjfu.lol.Ӣ��.���ƴ�ʦ;

import java.util.Iterator;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.g2d.ParticleEffect;
import com.badlogic.gdx.graphics.g2d.ParticleEmitter;

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
import edu.bjfu.lol.��̬.״̬��;
import edu.bjfu.lol.�߼�.������;
import edu.bjfu.lol.��̬.������;
import edu.bjfu.lol.��̬.Ӣ����;

class ����ƭ�������� extends ������
{
	private static final int ÿ���ι��� = 4;
	private static final int ���ܻ����˺� = 55;
	private static final float ���ܸ����˺���ռ����ǿ�ȱ��� = 0.4f;
	private static final float ������߰ٷֱ� = 10f / 100;
	private static final String ������ = "����ƭ��";
	private static final String �������� = String.format("%s  ÿ%d�ι���,��˹����ɶ����%d(+%.1f����ǿ��)ħ���˺�.\n����,���Ĺ����ٶ�����%.0f%%.",
			������, ÿ���ι���, ���ܻ����˺�, ���ܸ����˺���ռ����ǿ�ȱ���, ������߰ٷֱ� * 100);
	private static class ��ͨ����״̬�� extends ��ͨ��������Ч��״̬��
	{
		private static final String ״̬���� = String.format("����ƭ��������ÿ%d�ι�������˹����ɶ���ħ���˺���", ÿ���ι���);
		public ��ͨ����״̬��()
		{
			super(Integer.MAX_VALUE, ÿ���ι���, 0);
		}
		private class ׼���������� extends ������
		{
			private float ������X;
			private float ������Y;
			private String Ӣ��Ƥ���ļ���;
			public ׼����������(float ������x, float ������y, String Ӣ��Ƥ���ļ���)
			{
				������X = ������x;
				������Y = ������y;
				this.Ӣ��Ƥ���ļ��� = Ӣ��Ƥ���ļ���;
			}
			@Override
			protected ������ ���ɶ���()
			{
				return new ׼���ö�����(������X, ������Y, Ӣ��Ƥ���ļ���);
			}
		}
		private class ׼���ö����� extends ������
		{
			private �ӳ�Action �ӳ� = new �ӳ�Action(1f);
			private ������Ա�� ����;
			private Music ��Ч;
			private ׼���ö�����(float ������X, float ������Y, String Ӣ��Ƥ���ļ���)
			{
				ParticleEffect ����Ч�� = new ParticleEffect();
				����Ч��.load(Gdx.files.internal(������.����Ŀ¼ + "TwistedFateSkillE.p"), Ӣ����.getƤ����Դ(Ӣ��Ƥ���ļ���).getAtlas());
				���� = new ������Ա��(����Ч��);
				����.setPosition(������X, ������Y);
				����.addAction(�ӳ�);
				��Ч = Gdx.audio.newMusic(Gdx.files.internal(������.����Ŀ¼ + "TwistedFateSkillEReady.mp3"));
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
		private static class �ͷ������� extends ������
		{
			private float ������x;
			private float ������y;
			private String Ӣ��Ƥ���ļ���;
			public �ͷ�������(float ������x, float ������y, String Ӣ��Ƥ���ļ���)
			{
				this.������x = ������x;
				this.������y = ������y;
				this.Ӣ��Ƥ���ļ��� = Ӣ��Ƥ���ļ���;
			}
			@Override
			protected ������ ���ɶ���()
			{
				return new �ͷŶ�����(������x, ������y, Ӣ��Ƥ���ļ���);
			}
		}
		private static class �ͷŶ����� extends ������
		{
			private static final int Ч���� = 2;
			private �ӳ�Action[] �ӳ����� = new �ӳ�Action[Ч����];
			private ������Ա��[] �������� = new ������Ա��[Ч����];
			private Music ��Ч;
			private �ͷŶ�����(float ������X, float ������Y, String Ӣ��Ƥ���ļ���)
			{
				for (int i = 0; i < Ч����; i++)
				{
					�ӳ�����[i] = new �ӳ�Action(0.8f);
					ParticleEffect ����Ч�� = new ParticleEffect();
					����Ч��.loadEmitters(Gdx.files.internal(������.����Ŀ¼ + "TwistedFateSkillEEffect.p"));
					char �����ĸ = (char) (������.�������ֵ(8) + 'A');
					ParticleEmitter �������� = ����Ч��.findEmitter("Untitled");
					��������.setImagePath("SkillEEffect" + �����ĸ + ".png");
					����Ч��.loadEmitterImages(Ӣ����.getƤ����Դ(Ӣ��Ƥ���ļ���).getAtlas());
					��������[i] = new ������Ա��(����Ч��);
					��������[i].setPosition(������X, ������Y);
					��������[i].addAction(�ӳ�����[i]);
				}
				��Ч = Gdx.audio.newMusic(Gdx.files.internal(������.����Ŀ¼ + "TwistedFateSkillE.mp3"));
				��Ч.setOnCompletionListener(new ���ֲ������Զ�������());
			}
			public boolean is���()
			{
				if (�ӳ�����[0].isAction�ѽ���())
				{
					for (������Ա�� ���� : ��������)
					{
						����.remove();
						����.dispose();
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
				��Ч.play();
			}
		}
		@Override
		public void ��ͨ����(��ս��Ӣ���� ������, ��ս��Ӣ���� ��������, Iterator<��ͨ��������Ч��״̬��> ������)
		{
			����һ��(false);
			if (get��ǰ����() == ÿ���ι��� - 1)
			{
				if (������.is�ҷ�())
				{
					������װ����.ʵ��.�������(new ׼����������(��ս��Ļ��.�ҷ�X��������[������.getӢ������λ��() - 1], ��ս��Ļ��.�ҷ�Y��������[������.getӢ������λ��() - 1], ������.getӢ��().getӢ��Ƥ���ļ���()));
				}
				else
				{
					������װ����.ʵ��.�������(new ׼����������(��ս��Ļ��.�з�X��������[������.getӢ������λ��() - 1], ��ս��Ļ��.�з�Y��������[������.getӢ������λ��() - 1], ������.getӢ��().getӢ��Ƥ���ļ���()));
				}
			}
			else if (get��ǰ����() == ÿ���ι���)
			{
				��������();
				Gdx.app.debug("����ƭ��������.��ͨ����״̬��.��ͨ����", "��������ƭ��");
				���������� �������� = new ����������();
				if (��������.is�ҷ�())
				{
					��������.�������(new �ͷ�������(��ս��Ļ��.�ҷ�X��������[��������.getӢ������λ��()-1], ��ս��Ļ��.�ҷ�Y��������[��������.getӢ������λ��()-1], ������.getӢ��().getӢ��Ƥ���ļ���()));
				}
				else
				{
					��������.�������(new �ͷ�������(��ս��Ļ��.�з�X��������[��������.getӢ������λ��()-1], ��ս��Ļ��.�з�Y��������[��������.getӢ������λ��()-1], ������.getӢ��().getӢ��Ƥ���ļ���()));
				}
				��������.�����ħ���˺�(������, (int) (���ܻ����˺� + ���ܸ����˺���ռ����ǿ�ȱ��� * ������.get��ս�з���ǿ��()), ������.get��ս����ֵ������͸(), ������.get��ս�аٷֱȷ�����͸(), ��������);
				������װ����.ʵ��.�������(��������);
			}
		}
		@Override
		public String get״̬����()
		{
			return ״̬����;
		}
	}
	private static class �������״̬�� extends ״̬��
	{
		public �������״̬��()
		{
			super(Integer.MAX_VALUE);
		}
		@Override
		public void ����(��ս��Ӣ���� ��״̬����Ӣ��)
		{
			��״̬����Ӣ��.��ӹ����ٶȰٷֱȱ仯(������߰ٷֱ�);
		}
		@Override
		public String get״̬����()
		{
			return "����ƭ�����������Ĺ����ٶ�����";
		}
	}
	public ����ƭ��������()
	{
		super(Integer.MAX_VALUE, Integer.MAX_VALUE);
	}
	@Override
	public String get��������()
	{
		return ��������;
	}
	@Override
	public void ��ӱ���״̬(��ս��Ӣ���� ��ս��Ӣ��)
	{
		������װ����.ʵ��.�������(new ״̬�ı���ʾ������(��ս��Ӣ��.is�ҷ�(), ��ս��Ӣ��.getӢ������λ��(), "���١�", true));
		��ս��Ӣ��.�����ͨ��������Ч��״̬(new ��ͨ����״̬��());
		��ս��Ӣ��.��ӹ����ٶ�����״̬(new �������״̬��());
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
