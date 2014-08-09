package edu.bjfu.lol.��̬;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;

import edu.bjfu.lol.����;
import edu.bjfu.lol.scenes.scene2d.ui.������Ա��;
import edu.bjfu.lol.scenes.scene2d.����.������;
import edu.bjfu.lol.scenes.scene2d.����.����ǰҡ������;
import edu.bjfu.lol.scenes.scene2d.����.������;
import edu.bjfu.lol.screen.��ս��Ļ��;
import edu.bjfu.lol.screen.Ӣ����ϸ��Ļ��;
import edu.bjfu.lol.screen.Ӣ����ϸ��Ļ��.����������;
import edu.bjfu.lol.utils.������;
import edu.bjfu.lol.utils.���ֲ������Զ�������;
import edu.bjfu.lol.��̬.��ս��Ӣ����;

public abstract class Ӣ���� {
	private static final String ͷ���ļ��� = "Portrait";
	private static final String Ӣ��ͼ���ļ��� = "Hero";
	public abstract Ӣ�������� getӢ������();
	public abstract ������[] get��������();
	public final void ��ӱ���״̬(��ս��Ӣ���� ��ս��Ӣ��)
	{
		for (������ ���� : get��������())
		{
			����.��ӱ���״̬(��ս��Ӣ��);
		}
	}
	public abstract String getӢ������();
	public abstract String getӢ��Ƥ���ļ���();
	public final TextureRegion getӢ��ͷ��()
	{
		return ����.ʵ��.getӢ��Ƥ����Դ(getӢ��Ƥ���ļ���()).getRegion(ͷ���ļ���);
	}
	public static TextureRegion getӢ��ͼ��(String Ӣ��Ƥ���ļ���)
	{
		return ����.ʵ��.getӢ��Ƥ����Դ(Ӣ��Ƥ���ļ���).getRegion(Ӣ��ͼ���ļ���);
	}
	public final Music getӢ������()
	{
		Music ���� = Gdx.audio.newMusic(Gdx.files.internal(������.����Ŀ¼ + getӢ��Ƥ���ļ���() + ".mp3"));
		����.setOnCompletionListener(new ���ֲ������Զ�������());
		return ����;
	}
	public static Skin getƤ����Դ(String Ӣ��Ƥ���ļ���)
	{
		return ����.ʵ��.getӢ��Ƥ����Դ(Ӣ��Ƥ���ļ���);
	}
	public static TextureRegion get����ͼ��(String Ӣ��Ƥ���ļ���, String �����ļ���׺)
	{
		return ����.ʵ��.getӢ��Ƥ����Դ(Ӣ��Ƥ���ļ���).getRegion("SkillPortrait" + �����ļ���׺);
	}
	public final ����������[] getӢ����������(Ӣ����ϸ��Ļ�� Ӣ����ϸ��Ļ)
	{
		������[] �������� = get��������();
		����������[] ������������ = new ����������[��������.length];
		for (int i = 0 ; i < ��������.length; i++)
		{
			int ��һ���ͷŻغ��� = ��������[i].get��һ���ͷŻغ���();
			if (��һ���ͷŻغ��� == Integer.MAX_VALUE)
			{
				��һ���ͷŻغ��� = 1;
			}
			int �ͷż���غ��� = ��������[i].get�ͷż���غ���();
			if (�ͷż���غ��� == Integer.MAX_VALUE)
			{
				�ͷż���غ��� = 1;
			}
			������������[i] = Ӣ����ϸ��Ļ.new ����������(��������[i].get��������(), get����ͼ��(getӢ��Ƥ���ļ���(), ��������[i].get�����ļ���׺()), ��һ���ͷŻغ���, �ͷż���غ���);
		}
		return ������������;
	}
	private class ��ս��ͨ���������� extends ������
	{
		private static final float ��ͨ������������ = 0.7f;
		private static final float ���嶯��ʱ�� = ����ǰҡ������.��ս����ڶ�ʱ��;
		private ������Ա�� �����߶���;
		private ������Ա�� �����߶���;
		private Music ��Ч;
		/**
		 * @param ��Ч�ļ��� ����������Ŀ¼
		 */
		private ��ս��ͨ����������(int ������X, int ������Y, int ������X, int ������Y, boolean is�����ι���, String ��Ч�ļ���)
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
			TextureRegion[] ������ͼƬ���� = new TextureRegion[3];
			for (int i = 0; i < ������ͼƬ����.length; i++)
			{
				������ͼƬ����[i] = ��ս��Ļ��.ʵ��.getƤ����Դ().getRegion("AttackReceiver" + (char)(i + 'A'));
			}
			�����߶��� = new ������Ա��(���嶯��ʱ�� / ������ͼƬ����.length, ������ͼƬ����, Animation.NORMAL);
			�����߶���.setWidth(��ս��Ļ��.Ӣ��ͼƬ����� * ��ͨ������������);
			�����߶���.setHeight(��ս��Ļ��.Ӣ��ͼƬ���߶� * ��ͨ������������);
			�����߶���.setPosition(������X - �����߶���.getWidth() / 2, ������Y - �����߶���.getHeight() / 2);
			this.��Ч = Gdx.audio.newMusic(Gdx.files.internal(������.����Ŀ¼ + ��Ч�ļ���));
			this.��Ч.setOnCompletionListener(new ���ֲ������Զ�������());
		}
		@Override
		public boolean is���()
		{
			if (�����߶���.is�Ѿ�����())
			{
				�����߶���.remove();
				�����߶���.remove();
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
			��ս��Ļ��.ʵ��.�����Ա(�����߶���);
			��Ч.play();
		}
	}
	private class ��ͨ���������� extends ������
	{
		private int ������X;
		private int ������Y;
		private int ������X;
		private int ������Y;
		private boolean is�����ι���;
		private String Ӣ���չ������ļ���;
		public ��ͨ����������(int ������x, int ������y, int ������x, int ������y, boolean is�����ι���, String Ӣ���չ������ļ���)
		{
			������X = ������x;
			������Y = ������y;
			������X = ������x;
			������Y = ������y;
			this.is�����ι��� = is�����ι���;
			this.Ӣ���չ������ļ��� = Ӣ���չ������ļ���;
		}
		@Override
		protected ������ ���ɶ���()
		{
			return new ��ս��ͨ����������(������X, ������Y, ������X, ������Y, is�����ι���, Ӣ���չ������ļ���);
		}
	}
	public ������ get��ͨ��������(int ������X, int ������Y, int ������X, int ������Y, boolean is�����ι���, String Ӣ��Ƥ���ļ���, ��ս��Ӣ���� ��ս��Ӣ��)
	{
		return new ��ͨ����������(������X, ������Y, ������X, ������Y, is�����ι���, getӢ���չ������ļ���(��ս��Ӣ��));
	}
	public String getӢ���չ������ļ���(��ս��Ӣ���� ��ս��Ӣ��){return null;}
	public abstract boolean is��ս(��ս��Ӣ���� ��ս��Ӣ��);
	public String get������Ч�ļ���()
	{
		return getӢ��Ƥ���ļ���() + "Dying.mp3";
	}
}