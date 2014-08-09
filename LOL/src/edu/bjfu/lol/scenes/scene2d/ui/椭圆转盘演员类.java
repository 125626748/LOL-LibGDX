package edu.bjfu.lol.scenes.scene2d.ui;

import java.util.Arrays;
import java.util.Comparator;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.actions.FloatAction;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

import edu.bjfu.lol.����;
import edu.bjfu.lol.�����Ϣ��;
import edu.bjfu.lol.utils.ͼ�������;
import edu.bjfu.lol.utils.������;
import edu.bjfu.lol.��̬.Ӣ����;

public class ��Բת����Ա�� extends Actor
{
	private static final float һ����ռ�Ƕ� = (float) (2 * Math.PI / 5); 
	private static float �ݰ��᳤�� =  4.5f / 17.5f;
	public static float ת�����ĺ����� = ������.��Ļ�� / 2 - 10;
	public static float ת������������ = 320;
	public static final float ͼ����� = ������.��Ļ�� * 0.8f;
	public static final float ͼ���߶� = 350;
	private ͼ��[] ͼ���� = new ͼ��[5];
	private float ��Ļ����λ��;
	private FloatAction �ص����� = new FloatAction();
	private boolean is�������ɿ� = true;
	private class ͼ�� extends Image
	{
		// ͼ����Բ�еĺ�����
		private float ������;
		// ͼ����Բ�е�������
		private float ������;
		public ͼ��(Ӣ���� Ӣ��)
		{
			super(Ӣ�� == null ? ����.ʵ��.getUIƤ����Դ().getRegion("HeroNull") : Ӣ����.getӢ��ͼ��(Ӣ��.getӢ��Ƥ���ļ���()));
		}
	}
	/**
	 * Ϊ�˻�ͼʱ�Ȼ�������Ļ�ģ����������С��
	 */
	private static final Comparator<ͼ��> ͼ���ͼ�Ƚ��� = new Comparator<ͼ��>()
	{
		@Override
		public int compare(ͼ�� o1, ͼ�� o2)
		{
			if (o2.������ > o1.������)
			{
				return 1;
			}
			else if (o2.������ < o1.������)
			{
				return -1;
			}
			else
			{
				return 0;
			}
		}
	};
	public void ����Ӣ��ͼ��(int Ӣ���±�)
	{
		ͼ�� ��ͼ = ͼ����[Ӣ���±�]; 
		ͼ����[Ӣ���±�] = new ͼ��(�����Ϣ��.get����().getӢ������()[Ӣ���±�]);
		ͼ�������.������Ա��������ָ������(ͼ����[Ӣ���±�], ͼ�����);
		ͼ�������.������Ա��������ָ������(ͼ����[Ӣ���±�], ͼ���߶�);
		for (int i = 0; i < �����ͼ����.length; i++)
		{
			if (��ͼ == �����ͼ����[i])
			{
				�����ͼ����[i] = ͼ����[Ӣ���±�];
				break;
			}
		}
	}
	public void ����Ӣ��ͼ��()
	{
		Ӣ����[] Ӣ������ = �����Ϣ��.get����().getӢ������();
		for (int i = 0; i < ͼ����.length; i++)
		{
			ͼ����[i].remove();
			ͼ����[i] = new ͼ��(Ӣ������[i]);
		}
		for (Image ͼ : ͼ����)
		{
			ͼ�������.������Ա��������ָ������(ͼ, ͼ�����);
			ͼ�������.������Ա��������ָ������(ͼ, ͼ���߶�);
		}
		�����ͼ���� = Arrays.copyOf(ͼ����, ͼ����.length);
	}
	/**
	 * @param ����� ����������ı���
	 */
	public ��Բת����Ա��()
	{
		Ӣ����[] Ӣ������ = �����Ϣ��.get����().getӢ������();
		for (int i = 0; i < ͼ����.length; i++)
		{
			ͼ����[i] = new ͼ��(Ӣ������[i]);
		}
		for (Image ͼ : ͼ����)
		{
			ͼ�������.������Ա��������ָ������(ͼ, ͼ�����);
			ͼ�������.������Ա��������ָ������(ͼ, ͼ���߶�);
		}
		�����ͼ���� = Arrays.copyOf(ͼ����, ͼ����.length);
		�ص�����.setDuration(0.3f);
		�ص�����.setEnd(0);
	}
	/**
	 * ���ڻ�ͼǰ�����������
	 */
	private ͼ��[] �����ͼ����;
	@Override
	public void draw(SpriteBatch batch, float parentAlpha)
	{
		// �������ɿ�����δ�ص����涨λ��
		if (is�������ɿ� && �ص�����.getValue() != �ص�����.getEnd())
		{
			�ص�����.act(Gdx.graphics.getDeltaTime());
			��Ļ����λ�� = �ص�����.getValue();
		}
		�����ͼ��λ�ú����Ŵ�С();
		Arrays.sort(�����ͼ����, ͼ���ͼ�Ƚ���);
		for (ͼ�� ͼ : �����ͼ����)
		{
			ͼ.draw(batch, parentAlpha);
		}
	}
	/**
	 * @param ��ת�� ����Ϊ��ʱ����ת������Ϊ5
	 */
	public void ��ת��Ļ����λ��(float ��ת��)
	{
		��Ļ����λ�� += ��ת�� + 5;
		��Ļ����λ�� %= 5f;
	}
	/**
	 * ��Բ��������
	 * x=cos(t)
	 * y=sin(t) * �ݰ��᳤��
	 */
	private void �����ͼ��λ�ú����Ŵ�С()
	{
		for (int �� = 0; �� < 5; ��++)
		{
			// ��Ϊ��ͼ��0���Ǵ�xy�����-90�ȿ�ʼ��
			float �Ƕ� = (float) ((��Ļ����λ�� + ��) * һ����ռ�Ƕ� - Math.PI / 2);
			ͼ����[��].������ = (float) Math.cos(�Ƕ�);
			ͼ����[��].������ = (float) (Math.sin(�Ƕ�) * �ݰ��᳤��);
			float ���ű��� = (�ݰ��᳤�� - ͼ����[��].������) / 2 / �ݰ��᳤�� + 0.1f;
			ͼ����[��].setScale(���ű���);
			ͼ����[��].setPosition(ת�����ĺ����� + getScaleX() * ͼ����[��].������ - ͼ����[��].getWidth() * ���ű��� / 2, ת������������ + getScaleY() * ͼ����[��].������);
			ͼ����[��].setColor(new Color(���ű���, ���ű���, ���ű���, 1));
		}
	}
	public void ��֪ͨ�������ɿ�()
	{
		is�������ɿ� = true;
		�ص�����.setStart(��Ļ����λ��);
		�ص�����.setValue(��Ļ����λ��);
		�ص�����.setEnd(Math.round(��Ļ����λ��));
		�ص�����.restart();
	}
	public void ��֪ͨ�����Ѱ���()
	{
		is�������ɿ� = false;
	}
	public boolean is�ص�����()
	{
		return is�������ɿ� && �ص�����.getValue() == �ص�����.getEnd();
	}
	public int get��Ļ����Ӣ���±�()
	{
		int ��� = (int) ��Ļ����λ�� % 5;
		if (��� != 0)
		{
			��� = 5 - ���;
		}
		return ���;
	}
	public void ת��Ŀ��λ��(int Ŀ��λ��)
	{
		if (Ŀ��λ�� != 0)
		{
			Ŀ��λ�� = 5 - Ŀ��λ��;
		}
		if (Ŀ��λ�� == 4 && ��Ļ����λ�� == 0)
		{
			��Ļ����λ�� = 5;
		}
		else if (Ŀ��λ�� == 0 && ��Ļ����λ�� == 4)
		{
			Ŀ��λ�� = 5;
		}
		else if (Ŀ��λ�� == 1 && ��Ļ����λ�� == 5)
		{
			��Ļ����λ�� = 0;
		}
		else if (Ŀ��λ�� == 5 && ��Ļ����λ�� == 1)
		{
			Ŀ��λ�� = 0;
		}
		�ص�����.setStart(��Ļ����λ��);
		�ص�����.setValue(��Ļ����λ��);
		�ص�����.setEnd(Ŀ��λ��);
		�ص�����.restart();
	}
}
