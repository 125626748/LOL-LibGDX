package edu.bjfu.lol.�߼�;

import java.util.Random;

public class ������ {
	
	// ���������
	private static final Random RANDOM = new Random();
	public static boolean �������ֵ()
	{
		return RANDOM.nextBoolean();
	}
	/**
	 * ����[0,����)�ϵ��������ֵ
	 */
	public static int �������ֵ(int ����)
	{
		return RANDOM.nextInt(����);
	}
	/**
	 * ���ֵӦ�ô������ֵ
	 * @param ���ֵ ����
	 * @param ���ֵ ����
	 * @param �ٷֱ� ����
	 * @return
	 */
	public static int ����_���ֵ_���ֵ_�ٷֱ�_����ֵ(int ���ֵ, int ���ֵ, float �ٷֱ�)
	{
		int ���ֵ = ���ֵ - ���ֵ;
		return (int) (���ֵ + ���ֵ * �ٷֱ�);
	}
	public static boolean ����_����_�����Ƿ���(float ����)
	{
		int x = RANDOM.nextInt(100);
		return x < 100 * ����;
	}
	/**
	 * @param ��ʼֵ ����
	 * @param ��ֵ�仯
	 * @param �ٷֱȱ仯
	 * @return ����
	 */
	public static int ����_��ʼֵ_��ֵ�仯_�ٷֱȱ仯_����ֵ(int ��ʼֵ, int ��ֵ�仯, float �ٷֱȱ仯)
	{
		��ʼֵ = ����_�ٷֱȱ仯_����ֵ(��ʼֵ, �ٷֱȱ仯);
		��ʼֵ = ����_��ֵ�仯_����ֵ(��ʼֵ, ��ֵ�仯);
		return ��ʼֵ;
	}
	/**
	 * ���ݻ��׻��Լ����Ӧ����
	 * @return ����
	 */
	public static float ����_��ֵ_����ٷֱȼ���(int ���׻���)
	{
		return -1.0f * ���׻��� / (100 + ���׻���);
	}
	/**
	 * @param ��ֵ ����
	 * @param �ٷֱȱ仯
	 * @return ����
	 */
	public static int ����_�ٷֱȱ仯_����ֵ(int ��ֵ, float �ٷֱȱ仯)
	{
		��ֵ *= 1 + �ٷֱȱ仯;
		return ��ֵ >= 0 ? ��ֵ : 0;
	}
	/**
	 * @param ��ʼ�ٷֱ� ����
	 * @param �ٷֱȱ仯
	 * @return ����
	 */
	public static float ��ʼ�ٷֱ�_�ٷֱȱ仯_���(float ��ʼ�ٷֱ�, float �ٷֱȱ仯)
	{
		��ʼ�ٷֱ� += �ٷֱȱ仯;
		return ��ʼ�ٷֱ� >= 0 ? ��ʼ�ٷֱ� : 0;
	}
	/**
	 * @param ��ʼ�ٷֱ� ����
	 * @param �ٷֱȱ仯
	 * @return ����
	 */
	public static float ��ʼ�ٷֱ�_�ٷֱȱ仯_���(float ��ʼ�ٷֱ�, float �ٷֱȱ仯)
	{
		��ʼ�ٷֱ� *= 1 + �ٷֱȱ仯;
		return ��ʼ�ٷֱ� >= 0 ? ��ʼ�ٷֱ� : 0;
	}
	public static int ����_��ֵ�仯_����ֵ(int ��ʼֵ, int ��ֵ�仯)
	{
		��ʼֵ += ��ֵ�仯;
		return ��ʼֵ >= 0 ? ��ʼֵ : 0;
	}
	public static int ����_�����ٶ�_���㹥���ܴ���(float �����ٶ�)
	{
		return �����ٶ� < 1 ? 1 : (int)�����ٶ�;
	}
}
