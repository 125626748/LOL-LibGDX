package edu.bjfu.lol.Ӣ��.ĺ��֮��;

import java.util.Iterator;

import com.badlogic.gdx.Gdx;

import edu.bjfu.lol.scenes.scene2d.����.������װ����;
import edu.bjfu.lol.scenes.scene2d.����.����������;
import edu.bjfu.lol.scenes.scene2d.����.״̬�ı���ʾ������;
import edu.bjfu.lol.��̬.��ս��Ӣ����;
import edu.bjfu.lol.��̬.��ս��Ӣ����.��ͨ��������Ч��״̬��;
import edu.bjfu.lol.��̬.������;

class �̷���аն������ extends ������
{
	private static final int ÿ�����غ� = 5;
	private static final int �����˺�ֵ = 8;
	private static final float �����˺���ռ�������ֵ�ٷֱ� = 10f / 100;
	private static final String ������ = "�̷���аն";
	private static final String �������� = String.format("%s  ÿ��%d�غ�,������һ��ͨ�����ͻ���ɶ���%d(+%.0f%%�����\n��ֵ)ħ���˺�",
			������, ÿ�����غ�, �����˺�ֵ, �����˺���ռ�������ֵ�ٷֱ� * 100);
	protected static class �̷���аն״̬�� extends ��ͨ��������Ч��״̬��
	{
		public �̷���аն״̬��()
		{
			super(Integer.MAX_VALUE);
		}
		@Override
		public void ��ͨ����(��ս��Ӣ���� ������, ��ս��Ӣ���� ��������, Iterator<��ͨ��������Ч��״̬��> ������)
		{
			int �ѹ��غ��� = (int) get�ѳ����غ���();
			Gdx.app.debug("�̷���аն������.�̷���аն״̬��.��ͨ����", String.format("�̷���аն���ѹ�%d�غ�\n", �ѹ��غ���));
			if (�ѹ��غ��� >= ÿ�����غ�)
			{
				Gdx.app.debug("�̷���аն������.�̷���аն״̬��.��ͨ����", "�ͷ��̷���аն");
				���������� �������� = new ����������();
				��������.�������(new ״̬�ı���ʾ������(������.is�ҷ�(), ������.getӢ������λ��(), "�̷���аն", true));
				int �˺� = ��������.�����ħ���˺�(������, (int) (������.get��ս���������ֵ() * �����˺���ռ�������ֵ�ٷֱ�), ������.get��ս����ֵ������͸(), ������.get��ս�аٷֱȷ�����͸(), ��������);
				������װ����.ʵ��.�������(��������);
				������.������Ѫ(�˺�, false);
				����״̬�غ���();
			}
		}
		@Override
		public String get״̬����()
		{
			return ��������;
		}
		protected boolean is����׼������()
		{
			return get�ѳ����غ���() >= ÿ�����غ�;
		}
	}
	public �̷���аն������()
	{
		super(Integer.MAX_VALUE, Integer.MAX_VALUE);
	}
	@Override
	public void ��ӱ���״̬(��ս��Ӣ���� ��ս��Ӣ��)
	{
		��ս��Ӣ��.�����ͨ��������Ч��״̬(new �̷���аն״̬��());
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
