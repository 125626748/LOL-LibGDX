package edu.bjfu.lol.Ӣ��.���ƴ�ʦ;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.g2d.ParticleEffect;
import com.badlogic.gdx.graphics.g2d.ParticleEmitter;

import edu.bjfu.lol.scenes.scene2d.actions.����ƶ�Action;
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
import edu.bjfu.lol.�߼�.������;
import edu.bjfu.lol.��̬.������;
import edu.bjfu.lol.��̬.Ӣ����;

class �����Ƽ����� extends ������
{
	private static final int ��һ���ͷŻغ��� = 1;
	private static final int �ͷż���غ��� = 3;
	private static final int ���ܻ����˺� = 60;
	private static final float ���ܸ����˺���ռ����ǿ�ȱ��� = 0.65f;
	private static final float ������ = 50f / 100;
	private static final String ������ = "������";
	private static final String �������� = String.format("%s  �ӳ����ſ���,�Եз�ȫ��ÿ�����%d(+%.2f����ǿ��)ħ����\n��,������%.0f%%.",
			������
			,���ܻ����˺�, ���ܸ����˺���ռ����ǿ�ȱ���, ������ * 100);
	public �����Ƽ�����()
	{
		super(��һ���ͷŻغ���, �ͷż���غ���);
	}
	private class �ͷ������� extends ������
	{
		private float ������x;
		private float ������y;
		private float ������x;
		private float ������y;
		private String Ӣ��Ƥ���ļ���;
		public �ͷ�������(float ������x, float ������y, float ������x, float ������y, String Ӣ��Ƥ���ļ���)
		{
			this.������x = ������x;
			this.������y = ������y;
			this.������x = ������x;
			this.������y = ������y;
			this.Ӣ��Ƥ���ļ��� = Ӣ��Ƥ���ļ���;
		}
		@Override
		protected ������ ���ɶ���()
		{
			return new �ͷŶ�����(������x, ������y, ������x, ������y, Ӣ��Ƥ���ļ���);
		}
	}
	private class �ͷŶ����� extends ������
	{
		private ����ƶ�Action[] �ƶ�Action����;
		private ������Ա��[] �������� = new ������Ա��[3];
		private Music ��Ч;
		public �ͷŶ�����(float ������x, float ������y, float ������x, float ������y, String Ӣ��Ƥ���ļ���)
		{
			double ��� = Math.sqrt((������y - ������y) * (������y - ������y) + (������x - ������x) * (������x - ������x)) * 2;
			double �����߽Ƕ� = Math.atan((������y - ������y) / (������x - ������x)) / Math.PI * 180;
			if (������x < ������x)
			{
				�����߽Ƕ� += 180;
			}
			int �м��±� = ��������.length / 2;
			�ƶ�Action���� = new ����ƶ�Action[��������.length];
			ParticleEffect[] ����Ч������ = new ParticleEffect[��������.length];
			for (int i = 0; i < ��������.length; i++)
			{
				����Ч������[i] = new ParticleEffect();
				����Ч������[i].loadEmitters(Gdx.files.internal(������.����Ŀ¼ + "TwistedFateSkillQ.p"));
				��������[i] = new ������Ա��(����Ч������[i]);
				��������[i].setPosition(������x, ������y);
				double �Ƕ� = �����߽Ƕ� - (i - �м��±�) * 20;
				ParticleEmitter �������� = ����Ч������[i].findEmitter("Untitled");
				int ����� = ������.�������ֵ(3);
				switch (�����)
				{
					case 0:
						��������.setImagePath("SkillWBlue.png");
						break;
					case 1:
						��������.setImagePath("SkillWRed.png");
						break;
					case 2:
						��������.setImagePath("SkillWYellow.png");
						break;
				}
				����Ч������[i].loadEmitterImages(Ӣ����.getƤ����Դ(Ӣ��Ƥ���ļ���).getAtlas());
				��������.getRotation().setHigh((float) �Ƕ� - 90);
				double ���� = �Ƕ� / 180 * Math.PI;
				float ��Խ�����X = (float) (��� * Math.cos(����));
				float ��Խ�����Y = (float) (��� * Math.sin(����));
				�ƶ�Action����[i] = new ����ƶ�Action(��Խ�����X, ��Խ�����Y, 0.6f);
				��������[i].addAction(�ƶ�Action����[i]);
			}
			��Ч = Gdx.audio.newMusic(Gdx.files.internal(������.����Ŀ¼ + "TwistedFateSkillQ.mp3"));
			��Ч.setOnCompletionListener(new ���ֲ������Զ�������());
		}
		@Override
		public boolean is���()
		{
			if (�ƶ�Action����[0].isAction�ѽ���())
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
	public boolean �ͷ�(��ս�������� �з�����, ��ս��Ӣ���� �ͷŴ˼��ܵ�Ӣ��)
	{
		int �����˺� = (int) (���ܻ����˺� + ���ܸ����˺���ռ����ǿ�ȱ��� * �ͷŴ˼��ܵ�Ӣ��.get��ս�з���ǿ��());
		int ���˺� = 0;
		boolean is���� = false;
		int ��ֵ��͸ = �ͷŴ˼��ܵ�Ӣ��.get��ս����ֵ������͸();
		float �ٷֱȴ�͸ = �ͷŴ˼��ܵ�Ӣ��.get��ս�аٷֱȷ�����͸();
		float ������x = 0;
		float ������y = 0;
		int ���������� = 0;
		���������� �������� = new ����������();
		for (��ս��Ӣ���� Ӣ�� : �з�����.get��ս��Ӣ������())
		{
			if (Ӣ�� != null && !Ӣ��.is����())
			{
				����������++;
				if (Ӣ��.is�ҷ�())
				{
					������x += ��ս��Ļ��.�ҷ�X��������[Ӣ��.getӢ������λ��()-1];
					������y += ��ս��Ļ��.�ҷ�Y��������[Ӣ��.getӢ������λ��()-1];
				}
				else
				{
					������x += ��ս��Ļ��.�з�X��������[Ӣ��.getӢ������λ��()-1];
					������y += ��ս��Ļ��.�з�Y��������[Ӣ��.getӢ������λ��()-1];
				}
				if (������.����_����_�����Ƿ���(������))
				{
					���˺� += Ӣ��.�����ħ���˺�(�ͷŴ˼��ܵ�Ӣ��, �����˺�, ��ֵ��͸, �ٷֱȴ�͸, ��������);
					is���� = true;
				}
			}
		}
		������x /= ����������;
		������y /= ����������;
		if (�ͷŴ˼��ܵ�Ӣ��.is�ҷ�())
		{
			������װ����.ʵ��.�������(new �ͷ�������(��ս��Ļ��.�ҷ�X��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1], ��ս��Ļ��.�ҷ�Y��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1], ������x, ������y, �ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���()));
		}
		else
		{
			������װ����.ʵ��.�������(new �ͷ�������(��ս��Ļ��.�з�X��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1], ��ս��Ļ��.�з�Y��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1], ������x, ������y, �ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���()));
		}
		if (is����)
		{
			������װ����.ʵ��.�������(��������);
			�ͷŴ˼��ܵ�Ӣ��.������Ѫ(���˺�, true);
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
		return "A";
	}
}
