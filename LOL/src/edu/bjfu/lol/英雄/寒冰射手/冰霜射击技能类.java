package edu.bjfu.lol.Ӣ��.��������;

import java.util.Iterator;

import com.badlogic.gdx.Gdx;

import edu.bjfu.lol.scenes.scene2d.����.������װ����;
import edu.bjfu.lol.scenes.scene2d.����.����������;
import edu.bjfu.lol.scenes.scene2d.����.״̬�ı���ʾ������;
import edu.bjfu.lol.��̬.��ս��Ӣ����;
import edu.bjfu.lol.��̬.��ս��Ӣ����.��ͨ��������Ч��״̬��;
import edu.bjfu.lol.��̬.״̬��;
import edu.bjfu.lol.��̬.������;

class ��˪��������� extends ������
{
	private static final float ����ֵ���Ͱٷֱ� = -0.15f;
	private static final int ����ֵ���ͳ����غ��� = 2;
	private static final String ������ = "��˪���";
	private static final String �������� = String.format("%s  ��ϣ��ÿ����ͨ��������Ŀ��%.0f%%������ֵ,����%d�غ�,��Ч\n�����ɵ���.",
			������, -����ֵ���Ͱٷֱ� * 100, ����ֵ���ͳ����غ���);
	protected static class ��˪���״̬�� extends ��ͨ��������Ч��״̬��
	{
		private static class ����ֵ����״̬�� extends ״̬��
		{
			public ����ֵ����״̬��()
			{
				super(����ֵ���ͳ����غ���);
			}
			@Override
			public void ����(��ս��Ӣ���� ��״̬����Ӣ��)
			{
				��״̬����Ӣ��.�������ֵ�ٷֱȱ仯(����ֵ���Ͱٷֱ�);
			}
			@Override
			public String get״̬����()
			{
				return "�ܵ���˪������ã�����ֵ����";
			}
		}
		public ��˪���״̬��()
		{
			super(Integer.MAX_VALUE);
		}
		@Override
		public void ��ͨ����(��ս��Ӣ���� ������, ��ս��Ӣ���� ��������, Iterator<��ͨ��������Ч��״̬��> ������)
		{
			Gdx.app.debug("��˪���������.��˪���״̬��.��ͨ����", String.format("���Ա�˪�����%s��%s�������ֵ����״̬\n", ������.get����������λ��Ӣ������(), ��������.get����������λ��Ӣ������()));
			�������ֵ����״̬(��������, null);
		}
		protected static void �������ֵ����״̬(��ս��Ӣ���� ��������, ���������� ��������)
		{
			if (�������� == null)
			{
				������װ����.ʵ��.�������(new ״̬�ı���ʾ������(��������.is�ҷ�(), ��������.getӢ������λ��(), "����ֵ��", false));
			}
			else
			{
				��������.�������(new ״̬�ı���ʾ������(��������.is�ҷ�(), ��������.getӢ������λ��(), "����ֵ��", false));
			}
			״̬�� ����ֵ����״̬ = ��������.get����ֵ����״̬(����ֵ����״̬��.class);
			// ��״̬���ɵ���
			if (����ֵ����״̬ == null)
			{
				��������.�������ֵ����״̬(new ����ֵ����״̬��());
			}
			else
			{
				����ֵ����״̬.����״̬�غ���();
			}
		}
		@Override
		public String get״̬����()
		{
			return ��������;
		}
	}
	public ��˪���������()
	{
		super(Integer.MAX_VALUE, Integer.MAX_VALUE);
	}
	@Override
	public void ��ӱ���״̬(��ս��Ӣ���� ��ս��Ӣ��)
	{
		��ս��Ӣ��.�����ͨ��������Ч��״̬(new ��˪���״̬��());
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
		return "B";
	}
}
