package edu.bjfu.lol.Ӣ��.������ʹ;

import java.util.Iterator;

import com.badlogic.gdx.Gdx;

import edu.bjfu.lol.scenes.scene2d.����.������װ����;
import edu.bjfu.lol.scenes.scene2d.����.����������;
import edu.bjfu.lol.scenes.scene2d.����.״̬�ı���ʾ������;
import edu.bjfu.lol.��̬.��ս��Ӣ����;
import edu.bjfu.lol.��̬.��ս��Ӣ����.��ͨ��������Ч��״̬��;
import edu.bjfu.lol.��̬.״̬��;
import edu.bjfu.lol.��̬.������;

class ʥ�漼���� extends ������
{
	private static final float ����ħ�����ٰٷֱ� = 3f / 100;
	private static final int Ч�������غ��� = 2;
	private static final int Ч�������� = 5;
	private static final String ������ = "ʥ��";
	private static final String �������� = String.format("%s  ����������һ���з�Ӣ��,Ŀ����ʧ%.0f%%���׺�ħ������,����%d�غ�,\n��Ч�������Ե���%d��.",
			������, ����ħ�����ٰٷֱ� * 100, Ч�������غ���, Ч��������);
	protected static class ʥ��״̬�� extends ��ͨ��������Ч��״̬��
	{
		private static class ���׼���״̬�� extends ״̬��
		{
			public ���׼���״̬��()
			{
				super(Ч�������غ���, Ч��������, 1);
			}
			@Override
			public void ����(��ս��Ӣ���� ��״̬����Ӣ��)
			{
				��״̬����Ӣ��.��ӻ��װٷֱȱ仯(-����ħ�����ٰٷֱ� * get��ǰ����());
			}
			@Override
			public String get״̬����()
			{
				return "ʥ�棬���׼���";
			}
		}
		private static class ħ������״̬�� extends ״̬��
		{
			public ħ������״̬��()
			{
				super(Ч�������غ���, Ч��������, 1);
			}
			@Override
			public void ����(��ս��Ӣ���� ��״̬����Ӣ��)
			{
				��״̬����Ӣ��.���ħ�����԰ٷֱȱ仯(-����ħ�����ٰٷֱ� * get��ǰ����());
			}
			@Override
			public String get״̬����()
			{
				return "ʥ�棬ħ������";
			}
		}
		public ʥ��״̬��()
		{
			super(Integer.MAX_VALUE);
		}
		@Override
		public String get״̬����()
		{
			return ��������;
		}
		@Override
		public void ��ͨ����(��ս��Ӣ���� ������, ��ս��Ӣ���� ��������, Iterator<��ͨ��������Ч��״̬��> ������)
		{
			ʩ��ʥ��Ч��(��������, null);
		}
		protected static void ʩ��ʥ��Ч��(��ս��Ӣ���� ��ʩ��Ӣ��, ���������� ��������)
		{
			Gdx.app.debug("ʥ�漼����.ʥ��״̬��.ʩ��ʥ��Ч��", String.format("%s��ʩ��ʥ��Ч��\n", ��ʩ��Ӣ��.get����������λ��Ӣ������()));
			״̬�� ���׼���״̬ = ��ʩ��Ӣ��.get���׼���״̬(���׼���״̬��.class);
			if (�������� == null)
			{
				������װ����.ʵ��.�������(new ״̬�ı���ʾ������(��ʩ��Ӣ��.is�ҷ�(), ��ʩ��Ӣ��.getӢ������λ��(), "˫����", false));
			}
			else
			{
				��������.�������(new ״̬�ı���ʾ������(��ʩ��Ӣ��.is�ҷ�(), ��ʩ��Ӣ��.getӢ������λ��(), "˫����", false));
			}
			if (���׼���״̬ == null)
			{
				��ʩ��Ӣ��.��ӻ���ֵ����״̬(new ���׼���״̬��());
				��ʩ��Ӣ��.���ħ�����Լ���״̬(new ħ������״̬��());
			}
			else
			{
				״̬�� ħ������״̬ = ��ʩ��Ӣ��.getħ�����Լ���״̬(ħ������״̬��.class);
				���׼���״̬.����һ��(false);
				ħ������״̬.����һ��(false);
				���׼���״̬.����״̬�غ���();
				ħ������״̬.����״̬�غ���();
			}
		}
	}
	public ʥ�漼����()
	{
		super(Integer.MAX_VALUE, Integer.MAX_VALUE);
	}
	@Override
	public void ��ӱ���״̬(��ս��Ӣ���� ��ս��Ӣ��)
	{
		��ս��Ӣ��.�����ͨ��������Ч��״̬(new ʥ��״̬��());
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
