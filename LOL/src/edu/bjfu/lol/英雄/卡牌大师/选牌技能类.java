package edu.bjfu.lol.Ӣ��.���ƴ�ʦ;

import java.util.Iterator;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.g2d.ParticleEffect;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;

import edu.bjfu.lol.scenes.scene2d.actions.�ӳ�Action;
import edu.bjfu.lol.scenes.scene2d.ui.������Ա��;
import edu.bjfu.lol.scenes.scene2d.����.������;
import edu.bjfu.lol.scenes.scene2d.����.������;
import edu.bjfu.lol.scenes.scene2d.����.������װ����;
import edu.bjfu.lol.scenes.scene2d.����.����������;
import edu.bjfu.lol.scenes.scene2d.����.״̬�ı���ʾ������;
import edu.bjfu.lol.screen.��ս��Ļ��;
import edu.bjfu.lol.utils.ͼ�������;
import edu.bjfu.lol.utils.������;
import edu.bjfu.lol.utils.���ֲ������Զ�������;
import edu.bjfu.lol.��̬.��ս��Ӣ����;
import edu.bjfu.lol.��̬.��ս��Ӣ����.��ͨ��������Ч��״̬��;
import edu.bjfu.lol.��̬.��ս��������;
import edu.bjfu.lol.��̬.״̬��;
import edu.bjfu.lol.�߼�.������;
import edu.bjfu.lol.��̬.������;
import edu.bjfu.lol.��̬.Ӣ����;

class ѡ�Ƽ����� extends ������
{
	private static final int ��һ���ͷŻغ��� = 1;
	private static final int �ͷż���غ��� = 3;
	private static final int ����������Ч�غ��� = 2;
	private static final int ���Ƽ��ܻ����˺� = 40;
	private static final int ���Ƽ��ܻ����˺� = 30;
	private static final int ���Ƽ��ܻ����˺� = 15;
	private static final float ���ܸ����˺���ռ���������� = 1;
	private static final float ���ܸ����˺���ռ����ǿ�ȱ��� = 0.4f;
	private static final float ����ֵ���Ͱٷֱ� = 30f / 100;
	private static final int ����ֵ���ͳ����غ��� = 1;
	private static final int ѣ�λغ��� = 1;
	private static final String ������ = "ѡ��";
	private static final String �������� = String.format("%s  ���ѡ��,�´ι���������Ч,����%d�غ�.�������%d(+%.0f������)\n(+%.1f����ǿ��)ħ���˺�,���ƶԷ�Χ�������%d(+%.0f������)(%.1f����\nǿ��)ħ���˺�����������ֵ%.0f%%,����%d�غ�,��ɫ�������%d(+%.0f������)\n(+%.1f����ǿ��)ħ���˺���ѣ��Ŀ��%d�غ�.", 
			������
			, ����������Ч�غ���
			, ���Ƽ��ܻ����˺�, ���ܸ����˺���ռ����������, ���ܸ����˺���ռ����ǿ�ȱ���, 
			���Ƽ��ܻ����˺�, ���ܸ����˺���ռ����������, ���ܸ����˺���ռ����ǿ�ȱ���, ����ֵ���Ͱٷֱ� * 100, ����ֵ���ͳ����غ���, 
			���Ƽ��ܻ����˺�, ���ܸ����˺���ռ����������, ���ܸ����˺���ռ����ǿ�ȱ���, ѣ�λغ���);
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
			return "���ƣ�����ֵ����";
		}
	}
	private static class ����Ч�������� extends ������
	{
		private float ������x;
		private float ������y;
		private String Ӣ��Ƥ���ļ���;
		public ����Ч��������(float ������x, float ������y, String Ӣ��Ƥ���ļ���)
		{
			this.������x = ������x;
			this.������y = ������y;
			this.Ӣ��Ƥ���ļ��� = Ӣ��Ƥ���ļ���;
		}
		@Override
		protected ������ ���ɶ���()
		{
			return new ����Ч��������(������x, ������y, Ӣ��Ƥ���ļ���);
		}
	}
	private static class ����Ч�������� extends ������
	{
		private �ӳ�Action �ӳ� = new �ӳ�Action(0.8f);
		private ������Ա�� ����;
		private ����Ч��������(float ������X, float ������Y, String Ӣ��Ƥ���ļ���)
		{
			ParticleEffect ����Ч�� = new ParticleEffect();
			����Ч��.load(Gdx.files.internal(������.����Ŀ¼ + "TwistedFateSkillWEffect.p"), Ӣ����.getƤ����Դ(Ӣ��Ƥ���ļ���).getAtlas());
			���� = new ������Ա��(����Ч��);
			����.setPosition(������X, ������Y);
			����.addAction(�ӳ�);
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
		}
	}
	protected static class ����������Ч״̬�� extends ��ͨ��������Ч��״̬��
	{
		public static final int ���� = 0;
		public static final int ���� = 1;
		public static final int ���� = 2;
		private int ��;
		public ����������Ч״̬��()
		{
			super(����������Ч�غ���);
			�� = ������.�������ֵ(3);
		}
		@Override
		public void ��ͨ����(��ս��Ӣ���� ������, ��ս��Ӣ���� ��������, Iterator<��ͨ��������Ч��״̬��> ������)
		{
			��ս��Ӣ���� ������Ӣ�� = ��������;
			int �����˺� = (int) (������.get��ս�й�����() * ���ܸ����˺���ռ���������� + ������.get��ս�з���ǿ��() * ���ܸ����˺���ռ����ǿ�ȱ���);
			int ����˺� = 0;
			boolean isȺ���˺� = false;
			int ��ֵ��͸ = ������.get��ս����ֵ������͸();
			float �ٷֱȴ�͸ = ������.get��ս�аٷֱȷ�����͸();
			switch (��)
			{
				// ����
				case ����:
					Gdx.app.debug("ѡ�Ƽ�����.����������Ч״̬��.��ͨ����", "ѡ������");
					�����˺� += ���Ƽ��ܻ����˺�;
					����˺� = ������Ӣ��.�����ħ���˺�(������, �����˺�, ��ֵ��͸, �ٷֱȴ�͸, null);
					break;
				// ����
				case ����:
					Gdx.app.debug("ѡ�Ƽ�����.����������Ч״̬��.��ͨ����", "ѡ�к���");
					�����˺� += ���Ƽ��ܻ����˺�;
					���������� �������� = new ����������();
					if (��������.is�ҷ�())
					{
						��������.�������(new ����Ч��������(��ս��Ļ��.�ҷ�X��������[��������.getӢ������λ��()-1], ��ս��Ļ��.�ҷ�Y��������[��������.getӢ������λ��()-1], ������.getӢ��().getӢ��Ƥ���ļ���()));
					}
					else
					{
						��������.�������(new ����Ч��������(��ս��Ļ��.�з�X��������[��������.getӢ������λ��()-1], ��ս��Ļ��.�з�Y��������[��������.getӢ������λ��()-1], ������.getӢ��().getӢ��Ƥ���ļ���()));
					}
					for (��ս��Ӣ���� ������Ӣ�� : ��������.get��������().getĬ�ϱ�����С��ΧӢ������(������))
					{
						if (������Ӣ�� != null && !������Ӣ��.is����())
						{
							��������.�������(new ״̬�ı���ʾ������(������Ӣ��.is�ҷ�(), ������Ӣ��.getӢ������λ��(), "����ֵ��", false));
							������Ӣ��.�������ֵ����״̬(new ����ֵ����״̬��());
							����˺� += ������Ӣ��.�����ħ���˺�(������, �����˺�, ��ֵ��͸, �ٷֱȴ�͸, ��������);
						}
					}
					������װ����.ʵ��.�������(��������);
					isȺ���˺� = true;
					break;
				// ����
				case ����:
					Gdx.app.debug("ѡ�Ƽ�����.����������Ч״̬��.��ͨ����", "ѡ�н���");
					�����˺� += ���Ƽ��ܻ����˺�;
					������Ӣ��.��ѣ��(ѣ�λغ���, null);
					����˺� += ������Ӣ��.�����ħ���˺�(������, �����˺�, ��ֵ��͸, �ٷֱȴ�͸, null);
					break;
			}
			������.������Ѫ(����˺�, isȺ���˺�);
			������.remove();
		}
		@Override
		public String get״̬����()
		{
			return "ѡ�ƣ�����������Ч";
		}
		protected int get��()
		{
			return ��;
		}
	}
	public ѡ�Ƽ�����()
	{
		super(��һ���ͷŻغ���, �ͷż���غ���);
	}
	private class �ͷ������� extends ������
	{
		private float ������x;
		private float ������y;
		private String Ӣ��Ƥ���ļ���;
		private int ��;
		public �ͷ�������(float ������x, float ������y, String Ӣ��Ƥ���ļ���, int ��)
		{
			this.������x = ������x;
			this.������y = ������y;
			this.Ӣ��Ƥ���ļ��� = Ӣ��Ƥ���ļ���;
			this.�� = ��;
		}
		@Override
		protected ������ ���ɶ���()
		{
			return new �ͷŶ�����(������x, ������y, Ӣ��Ƥ���ļ���, ��);
		}
	}
	private class �ͷŶ����� extends ������
	{
		private �ӳ�Action �ӳ� = new �ӳ�Action(0.7f);
		private Image ��ͼƬ;
		private Music ��Ч;
		private �ͷŶ�����(float ������X, float ������Y, String Ӣ��Ƥ���ļ���, int ��)
		{
			Skin Ƥ����Դ = Ӣ����.getƤ����Դ(Ӣ��Ƥ���ļ���);
			switch (��)
			{
				case ����������Ч״̬��.����:
					��ͼƬ = new Image(Ƥ����Դ.getRegion("SkillWSelectedRed"));
					break;
				case ����������Ч״̬��.����:
					��ͼƬ = new Image(Ƥ����Դ.getRegion("SkillWSelectedYellow"));
					break;
				case ����������Ч״̬��.����:
					��ͼƬ = new Image(Ƥ����Դ.getRegion("SkillWSelectedBlue"));
					break;
			}
			ͼ�������.������Ա��������ָ������(��ͼƬ, 80);
			��ͼƬ.setPosition(������X - ��ͼƬ.getWidth() / 2, ������Y - ��ͼƬ.getHeight() / 2);
			��ͼƬ.addAction(�ӳ�);
			��Ч = Gdx.audio.newMusic(Gdx.files.internal(������.����Ŀ¼ + "TwistedFateSkillW.mp3"));
			��Ч.setOnCompletionListener(new ���ֲ������Զ�������());
		}
		public boolean is���()
		{
			if (�ӳ�.isAction�ѽ���())
			{
				��ͼƬ.remove();
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
			��ս��Ļ��.ʵ��.�����Ա(��ͼƬ);
			��Ч.play();
		}
	}
	@Override
	public boolean �ͷ�(��ս�������� �з�����, ��ս��Ӣ���� �ͷŴ˼��ܵ�Ӣ��)
	{
		����������Ч״̬�� ����������Ч״̬ = new ����������Ч״̬��();
		if (�ͷŴ˼��ܵ�Ӣ��.is�ҷ�())
		{
			������װ����.ʵ��.�������(new �ͷ�������(��ս��Ļ��.�ҷ�X��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1], ��ս��Ļ��.�ҷ�Y��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1], �ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���(), ����������Ч״̬.get��()));
		}
		else
		{
			������װ����.ʵ��.�������(new �ͷ�������(��ս��Ļ��.�з�X��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1], ��ս��Ļ��.�з�Y��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1], �ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���(), ����������Ч״̬.get��()));
		}
		�ͷŴ˼��ܵ�Ӣ��.�����ͨ��������Ч��״̬(����������Ч״̬);
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
