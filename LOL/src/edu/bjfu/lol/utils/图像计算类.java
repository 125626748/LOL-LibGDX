package edu.bjfu.lol.utils;

import com.badlogic.gdx.scenes.scene2d.Actor;

public class ͼ�������
{
	public static void ������Ա��������ָ������(Actor ��Ա, float ����)
	{
		if (���� < ��Ա.getWidth())
		{
			��Ա.setSize(����, ��Ա.getHeight() * ���� / ��Ա.getWidth());
		}
	}
	public static void ������Ա��������ָ������(Actor ��Ա, float ����)
	{
		if (���� < ��Ա.getHeight())
		{
			��Ա.setSize(��Ա.getWidth() * ���� / ��Ա.getHeight(), ����);
		}
	}
}
