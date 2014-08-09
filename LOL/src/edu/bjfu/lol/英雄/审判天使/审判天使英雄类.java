package edu.bjfu.lol.Ӣ��.������ʹ;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.ParticleEffect;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

import edu.bjfu.lol.scenes.scene2d.ui.������Ա��;
import edu.bjfu.lol.scenes.scene2d.ui.������Ա��;
import edu.bjfu.lol.scenes.scene2d.����.������;
import edu.bjfu.lol.scenes.scene2d.����.����ǰҡ������;
import edu.bjfu.lol.scenes.scene2d.����.������;
import edu.bjfu.lol.screen.��ս��Ļ��;
import edu.bjfu.lol.utils.������;
import edu.bjfu.lol.utils.���ֲ������Զ�������;
import edu.bjfu.lol.��̬.��ս��Ӣ����;
import edu.bjfu.lol.��̬.������;
import edu.bjfu.lol.��̬.Ӣ��������;
import edu.bjfu.lol.��̬.Ӣ����;

public class ������ʹӢ���� extends Ӣ����
{
	private ������[] �������� = new ������[5];
	private Ӣ�������� Ӣ������ = new Ӣ��������();
	public ������ʹӢ����()
	{
		��������[0] = new ʥ�漼����();
		��������[1] = new ���㼼����();
		��������[2] = new ��ʥף��������();
		��������[3] = new ����֮ŭ������();
		��������[4] = new ��ʥ�ӻ�������();
		Ӣ������.set����ֵ(335);
		Ӣ������.set������(56);
		Ӣ������.set�����ٶ�(0.638f);
		Ӣ������.set����ֵ(21);
		Ӣ������.setħ������(30);
		Ӣ������.set�������ֵ(511);
		Ӣ������.set�����ظ�(8);
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
		return "������ʹ";
	}
	@Override
	public String getӢ���չ������ļ���(��ս��Ӣ���� ��ս��Ӣ��)
	{
		return "KayleAttackWithoutSkillE.mp3";
	}
	@Override
	public String getӢ��Ƥ���ļ���()
	{
		return "Kayle";
	}
	private class �չ������� extends ������
	{
		private int ������X;
		private int ������Y;
		private int ������X;
		private int ������Y;
		private boolean is�����ι���;
		private String Ӣ��Ƥ���ļ���;
		public �չ�������(int ������x, int ������y, int ������x, int ������y, boolean is�����ι���, String Ӣ��Ƥ���ļ���)
		{
			������X = ������x;
			������Y = ������y;
			������X = ������x;
			������Y = ������y;
			this.is�����ι��� = is�����ι���;
			this.Ӣ��Ƥ���ļ��� = Ӣ��Ƥ���ļ���;
		}
		@Override
		protected ������ ���ɶ���()
		{
			return new ��ͨ����������(������X, ������Y, ������X, ������Y, is�����ι���, Ӣ��Ƥ���ļ���);
		}
	}
	private class ��ͨ���������� extends ������
	{
		private static final float ��ͨ������������ = 0.7f;
		private static final float ���嶯��ʱ�� = ����ǰҡ������.��ս����ڶ�ʱ��;
		private ������Ա�� �����߶���;
		private ������Ա�� ����������;
		private Music ��Ч;
		private ��ͨ����������(int ������X, int ������Y, int ������X, int ������Y, boolean is�����ι���, String Ӣ��Ƥ���ļ���)
		{
			TextureRegion[] ������ͼƬ���� = new TextureRegion[4];
			for (int i = 0; i < ������ͼƬ����.length; i++)
			{
				������ͼƬ����[i] = ��ս��Ļ��.ʵ��.getƤ����Դ().getRegion("AttackGiver" + (is�����ι��� ? "Odd" : "Even") + (char)(i + 'A'));
			}
			�����߶��� = new ������Ա��(���嶯��ʱ�� / ������ͼƬ����.length, ������ͼƬ����, Animation.NORMAL);
			�����߶���.setWidth(��ս��Ļ��.Ӣ��ͼƬ����� * ��ͨ������������);
			�����߶���.setHeight(��ս��Ļ��.Ӣ��ͼƬ���߶� * ��ͨ������������);
			�����߶���.setPosition(������X - �����߶���.getWidth() / 2, ������Y - �����߶���.getHeight() / 2);
			ParticleEffect ����Ч�� = new ParticleEffect();
			����Ч��.load(Gdx.files.internal(������.����Ŀ¼ + "KayleSkillEAttack.p"), Ӣ����.getƤ����Դ(Ӣ��Ƥ���ļ���).getAtlas());
			���������� = new ������Ա��(����Ч��);
			����������.setPosition(������X, ������Y);
			��Ч = Gdx.audio.newMusic(Gdx.files.internal(������.����Ŀ¼ + "KayleAttackWithSkillE.mp3"));
			��Ч.setOnCompletionListener(new ���ֲ������Զ�������());
		}
		@Override
		public boolean is���()
		{
			if (�����߶���.is�Ѿ�����())
			{
				�����߶���.remove();
				����������.remove();
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
			��ս��Ļ��.ʵ��.�����Ա(�����߶���);
			��ս��Ļ��.ʵ��.�����Ա(����������);
			��Ч.play();
		}
	}
	@Override
	public ������ get��ͨ��������(int ������x, int ������y, int ������x, int ������y, boolean is�����ι���, String Ӣ��Ƥ���ļ���, ��ս��Ӣ���� ��ս��Ӣ��)
	{
		return new �չ�������(������x, ������y, ������x, ������y, is�����ι���, Ӣ��Ƥ���ļ���);
	}
	@Override
	public boolean is��ս(��ս��Ӣ���� ��ս��Ӣ��)
	{
		return ��ս��Ӣ��.get��ͨ��������Ч��״̬(����֮ŭ������.�չ������˺�״̬��.class) == null;
	}
}
