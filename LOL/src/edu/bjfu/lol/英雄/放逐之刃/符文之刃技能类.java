package edu.bjfu.lol.Ӣ��.����֮��;

import java.util.Iterator;

import com.badlogic.gdx.Gdx;

import edu.bjfu.lol.scenes.scene2d.����.������װ����;
import edu.bjfu.lol.scenes.scene2d.����.����������;
import edu.bjfu.lol.scenes.scene2d.����.״̬�ı���ʾ������;
import edu.bjfu.lol.��̬.��ս��Ӣ����;
import edu.bjfu.lol.��̬.��ս��Ӣ����.��ͨ��������Ч��״̬��;
import edu.bjfu.lol.��̬.״̬��;
import edu.bjfu.lol.��̬.������;

class ����֮�м����� extends ������
{
	private static final int ������ = 3;
	private static final float �����˺��ٷֱ� = 35f / 100;
	private static final String ������ = "����֮��";
	private static final String �������� = String.format("%s  �����ļ��ܽ�Ϊ���Ľ��г���,��ʹ������һ����ͨ�������\n����%.0f%%�˺�,���������Գ���%d��,ÿ�ι�������һ�����.", 
			������, �����˺��ٷֱ� * 100, ������);
	protected static class ����֮��״̬�� extends ��ͨ��������Ч��״̬��
	{
		public ����֮��״̬��()
		{
			super(Integer.MAX_VALUE, ������, 0);
		}
		@Override
		public void ��ͨ����(��ս��Ӣ���� ������, ��ս��Ӣ���� ��������, Iterator<��ͨ��������Ч��״̬��> ������)
		{
			if (get��ǰ����() > 0)
			{
				Gdx.app.debug("����֮�м�����.����֮��״̬��.��ͨ����", "����:" + get��ǰ����());
				���������� �������� = new ����������();
				������.����������˺�(������, (int)(�����˺��ٷֱ� * ������.get��ս�й�����()), ������.get��ս����ֵ���״�͸(), ������.get��ս�аٷֱȻ��״�͸(), ��������);
				��������.�������(new ״̬�ı���ʾ������(������.is�ҷ�(), ������.getӢ������λ��(), "����֮��", true));
				������װ����.ʵ��.�������(��������);
				������һ();
			}
		}
		@Override
		public String get״̬����()
		{
			return ��������;
		}
		public static void ��֪ͨ�������д���(int �����ͷŴ���, ��ս��Ӣ���� ����)
		{
			״̬�� ����֮��״̬ = ����.get��ͨ��������Ч��״̬(����֮��״̬��.class);
			while (�����ͷŴ��� > 0)
			{
				����֮��״̬.����һ��(false);
				�����ͷŴ���--;
			}
		}
	}
	public ����֮�м�����()
	{
		super(Integer.MAX_VALUE, Integer.MAX_VALUE);
	}
	@Override
	public void ��ӱ���״̬(��ս��Ӣ���� ��ս��Ӣ��)
	{
		��ս��Ӣ��.�����ͨ��������Ч��״̬(new ����֮��״̬��());
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
