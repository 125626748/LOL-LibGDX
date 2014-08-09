package edu.bjfu.lol.Ӣ��.���ƴ�ʦ;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.g2d.ParticleEffect;
import com.badlogic.gdx.graphics.g2d.ParticleEmitter;

import edu.bjfu.lol.scenes.scene2d.actions.�����ƶ�Action;
import edu.bjfu.lol.scenes.scene2d.ui.������Ա��;
import edu.bjfu.lol.scenes.scene2d.����.������;
import edu.bjfu.lol.scenes.scene2d.����.������;
import edu.bjfu.lol.screen.��ս��Ļ��;
import edu.bjfu.lol.utils.������;
import edu.bjfu.lol.utils.���ֲ������Զ�������;
import edu.bjfu.lol.��̬.��ս��Ӣ����;
import edu.bjfu.lol.Ӣ��.���ƴ�ʦ.ѡ�Ƽ�����.����������Ч״̬��;
import edu.bjfu.lol.��̬.������;
import edu.bjfu.lol.��̬.Ӣ��������;
import edu.bjfu.lol.��̬.Ӣ����;

public class ���ƴ�ʦӢ���� extends Ӣ����
{
	private ������[] �������� = new ������[4];
	private Ӣ�������� Ӣ������ = new Ӣ��������();
	public ���ƴ�ʦӢ����()
	{
		��������[0] = new �����Ƽ�����();
		��������[1] = new ѡ�Ƽ�����();
		��������[2] = new ����ƭ��������();
		��������[3] = new ���˼�����();
		Ӣ������.set�������ֵ(466);
		Ӣ������.set�����ظ�(5);
		Ӣ������.set������(50);
		Ӣ������.set�����ٶ�(0.651f);
		Ӣ������.set����ֵ(330);
		Ӣ������.set����ֵ(14);
		Ӣ������.setħ������(30);
	}
	@Override
	public Ӣ�������� getӢ������()
	{
		return Ӣ������;
	}
	@Override
	public ������[] get��������()
	{
		return ��������;
	}
	@Override
	public String getӢ������()
	{
		return "���ƴ�ʦ";
	}
	@Override
	public String getӢ��Ƥ���ļ���()
	{
		return "TwistedFate";
	}
	private class �չ������� extends ������
	{
		private float ������x;
		private float ������y;
		private float ������x;
		private float ������y;
		private String Ӣ��Ƥ���ļ���;
		private int Ч��;
		public �չ�������(float ������x, float ������y, float ������x, float ������y, String Ӣ��Ƥ���ļ���, int Ч��)
		{
			this.������x = ������x;
			this.������y = ������y;
			this.������x = ������x;
			this.������y = ������y;
			this.Ӣ��Ƥ���ļ��� = Ӣ��Ƥ���ļ���;
			this.Ч�� = Ч��;
		}
		@Override
		protected ������ ���ɶ���()
		{
			return new �չ�������(������x, ������y, ������x, ������y, Ӣ��Ƥ���ļ���, Ч��);
		}
	}
	private class �չ������� extends ������
	{
		private �����ƶ�Action �ƶ�Action;
		private ������Ա�� ����;
		private Music ��Ч;
		public �չ�������(float ������x, float ������y, float ������x, float ������y, String Ӣ��Ƥ���ļ���, int Ч��)
		{
			ParticleEffect ����Ч�� = new ParticleEffect();
			����Ч��.loadEmitters(Gdx.files.internal(������.����Ŀ¼ + "TwistedFateAttack.p"));
			float �Ƕ� = (float)(Math.atan((������y-������y)/(������x-������x)) / Math.PI * 180) - 90;
			if (������x < ������x)
			{
				�Ƕ� += 180;
			}
			ParticleEmitter ������ = ����Ч��.findEmitter("Untitled");
			������.getRotation().setHigh(�Ƕ�);
			���� = new ������Ա��(����Ч��);
			����.setPosition(������x, ������y);
			�ƶ�Action = new �����ƶ�Action(������x, ������y, 0.5f);
			����.addAction(�ƶ�Action);
			if (Ч�� >= 0)
			{
				switch (Ч��)
				{
					case ����������Ч״̬��.����:
						��Ч = Gdx.audio.newMusic(Gdx.files.internal(������.����Ŀ¼ + "TwistedFateSkillWRed.mp3"));
						������.setImagePath("SkillWRed.png");
						break;
					case ����������Ч״̬��.����:
						��Ч = Gdx.audio.newMusic(Gdx.files.internal(������.����Ŀ¼ + "TwistedFateSkillWYellow.mp3"));
						������.setImagePath("SkillWYellow.png");
						break;
					case ����������Ч״̬��.����:
						��Ч = Gdx.audio.newMusic(Gdx.files.internal(������.����Ŀ¼ + "TwistedFateSkillWBlue.mp3"));
						������.setImagePath("SkillWBlue.png");
						break;
				}
			}
			else
			{
				��Ч = Gdx.audio.newMusic(Gdx.files.internal(������.����Ŀ¼ + "TwistedFateAttack.mp3"));
			}
			��Ч.setOnCompletionListener(new ���ֲ������Զ�������());
			����Ч��.loadEmitterImages(Ӣ����.getƤ����Դ(Ӣ��Ƥ���ļ���).getAtlas());
		}
		@Override
		public boolean is���()
		{
			if (�ƶ�Action.isAction�ѽ���())
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
	public ������ get��ͨ��������(int ������x, int ������y, int ������x, int ������y, boolean is�����ι���, String Ӣ��Ƥ���ļ���, ��ս��Ӣ���� ��ս��Ӣ��)
	{
		����������Ч״̬�� ����������Ч״̬ = (����������Ч״̬��) ��ս��Ӣ��.get��ͨ��������Ч��״̬(ѡ�Ƽ�����.����������Ч״̬��.class);
		if (����������Ч״̬ != null)
		{
			return new �չ�������(������x, ������y, ������x, ������y, Ӣ��Ƥ���ļ���, ����������Ч״̬.get��());
		}
		else
		{
			return new �չ�������(������x, ������y, ������x, ������y, Ӣ��Ƥ���ļ���, -1);
		}
	}
	@Override
	public boolean is��ս(��ս��Ӣ���� ��ս��Ӣ��)
	{
		return false;
	}
}
