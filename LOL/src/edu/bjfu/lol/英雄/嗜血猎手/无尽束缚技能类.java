package edu.bjfu.lol.Ӣ��.��Ѫ����;

import edu.bjfu.lol.scenes.scene2d.����.������װ����;
import edu.bjfu.lol.scenes.scene2d.����.����������;
import edu.bjfu.lol.scenes.scene2d.����.״̬�ı���ʾ������;
import edu.bjfu.lol.��̬.��ս��Ӣ����;
import edu.bjfu.lol.��̬.��ս��Ӣ����.��������ʩ��״̬��;
import edu.bjfu.lol.��̬.��ս��������;
import edu.bjfu.lol.��̬.״̬��;
import edu.bjfu.lol.��̬.������;

class �޾����������� extends ������
{
	private static final int ��һ���ͷŻغ��� = 1;
	private static final int �ͷż���غ��� = 12;
	private static final int ѹ�ƻغ��� = 1;
	private static final int ���𹥻����� = 5;
	private static final int ���ܻ����˺� = 50;
	private static final float ���ܸ����˺���ռ���������� = 0.5f;
	private static final float ��������͵ȡ�ٷֱ� = 30f/ 100;
	private static final String ������ = "�޾�����";
	private static final String �������� = String.format("%s  ���������з����Ӣ��,����Ŀ��ѹ��%d�غ�,�ڴ��ڼ�,��\n��˻���Ŀ�귢��%d�ι���,������ܹ�%d(+%.1f������)ħ���˺�(����\n%d����ͨ����),�ͷż���ʱ���ڻ��%.0f%%��������͵ȡ.",
			������
			,ѹ�ƻغ���, ���𹥻�����, ���ܻ����˺�, ���ܸ����˺���ռ����������, ���𹥻�����, ��������͵ȡ�ٷֱ� * 100);
	private static class ������������ʩ��״̬�� extends ��������ʩ��״̬��
	{
		private ��ս��Ӣ���� ������Ӣ��;
		public ������������ʩ��״̬��(��ս��Ӣ���� ������Ӣ��)
		{
			super(ѹ�ƻغ���);
			this.������Ӣ�� = ������Ӣ��;
		}
		@Override
		protected void ��֪ͨ�����(��ս��Ӣ���� �����Ӣ��)
		{
			if (!�����Ӣ��.is����())
			{
				�����Ӣ��.�Ƴ�����͵ȡ����״̬(��������͵ȡ״̬��.class);
			}
			if (!������Ӣ��.is����())
			{
				������Ӣ��.�Ƴ���ѹ��״̬(��ѹ��״̬��.class, null);
			}
		}
		@Override
		public String get״̬����()
		{
			return "�޾���������ʩ��";
		}
	}
	private static class ��ѹ��״̬�� extends edu.bjfu.lol.��̬.��ս��Ӣ����.��ѹ��״̬��
	{
		public ��ѹ��״̬��()
		{
			super(ѹ�ƻغ���);
		}
		@Override
		public String get״̬����()
		{
			return "���޾�����ѹ��";
		}
	}
	private static class ��������͵ȡ״̬�� extends ״̬��
	{
		public ��������͵ȡ״̬��()
		{
			super(ѹ�ƻغ���);
		}
		@Override
		public void ����(��ս��Ӣ���� ��״̬����Ӣ��)
		{
			��״̬����Ӣ��.�������͵ȡ�ٷֱȱ仯(��������͵ȡ�ٷֱ�);
		}
		@Override
		public String get״̬����()
		{
			return "�޾������ͷ��ڼ䣬����˻�ö�������͵ȡ";
		}
	}
	public �޾�����������()
	{
		super(��һ���ͷŻغ���, �ͷż���غ���);
	}
	@Override
	public boolean �ͷ�(��ս�������� �з�����, ��ս��Ӣ���� �ͷŴ˼��ܵ�Ӣ��)
	{
		��ս��Ӣ���� ������Ӣ�� = �з�����.get���������Ӣ��(false);
		if (������Ӣ�� != null)
		{
			���������� �������� = new ����������();
			��������.�������(new ״̬�ı���ʾ������(�ͷŴ˼��ܵ�Ӣ��.is�ҷ�(), �ͷŴ˼��ܵ�Ӣ��.getӢ������λ��(), "��������͵ȡ", true));
			������Ӣ��.��ӱ�ѹ��״̬(new ��ѹ��״̬��(), ��������);
			������װ����.ʵ��.�������(��������);
			�ͷŴ˼��ܵ�Ӣ��.�������͵ȡ����״̬(new ��������͵ȡ״̬��());
			int ���ħ���˺� = ������Ӣ��.�����ħ���˺�(�ͷŴ˼��ܵ�Ӣ��, (int) (���ܻ����˺� + ���ܸ����˺���ռ���������� * �ͷŴ˼��ܵ�Ӣ��.get��ս�й�����()), �ͷŴ˼��ܵ�Ӣ��.get��ս����ֵ������͸(), �ͷŴ˼��ܵ�Ӣ��.get��ս�аٷֱȷ�����͸(), null);
			�ͷŴ˼��ܵ�Ӣ��.������Ѫ(���ħ���˺�, false);
			for (int i = 0; i < ���𹥻����� && !������Ӣ��.is����(); i++)
			{
				�ͷŴ˼��ܵ�Ӣ��.��ͨ����(������Ӣ��, 0, true, true);
			}
			�ͷŴ˼��ܵ�Ӣ��.������������ʩ��״̬(new ������������ʩ��״̬��(������Ӣ��));
			return true;
		}
		else
		{
			return false;
		}
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
		return "E";
	}
	@Override
	public boolean is����()
	{
		return true;
	}
}
