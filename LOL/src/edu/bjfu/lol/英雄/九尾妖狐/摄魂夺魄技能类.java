package edu.bjfu.lol.Ӣ��.��β����;

import edu.bjfu.lol.scenes.scene2d.����.������װ����;
import edu.bjfu.lol.scenes.scene2d.����.״̬�ı���ʾ������;
import edu.bjfu.lol.��̬.��ս��Ӣ����;
import edu.bjfu.lol.��̬.״̬��;
import edu.bjfu.lol.��̬.������;

class �����Ǽ����� extends ������
{
	private static final int ������ = 9;
	private static final float ������Ѫ�ٷֱ� = 35f / 100;
	private static final String ������ = "������";
	private static final String �������� = String.format("%s  �ڼ������е��˺�,�������һ�������ǵĳ���(һ����\n�������Ի��%d�����).�ڻ��%d�����Ч����,��һ�����ܻ��ö���\n��%.0f%%������Ѫ(������δ���У����Ч����������).",
			������, ������, ������, ������Ѫ�ٷֱ� * 100);
	protected static class ������״̬�� extends ״̬��
	{
		private ��ս��Ӣ���� ��״̬����Ӣ��;
		private static class ���ⷨ����Ѫ״̬�� extends ״̬��
		{
			public ���ⷨ����Ѫ״̬��()
			{
				super(Integer.MAX_VALUE);
			}
			@Override
			public void ����(��ս��Ӣ���� ��״̬����Ӣ��)
			{
				��״̬����Ӣ��.��ӷ�����Ѫ�ٷֱȱ仯(������Ѫ�ٷֱ�);
			}
			@Override
			public String get״̬����()
			{
				return "�����ǣ����ⷨ����Ѫ";
			}
		}
		public ������״̬��(��ս��Ӣ���� ��״̬����Ӣ��) {
			super(Integer.MAX_VALUE, ������, 0);
			this.��״̬����Ӣ�� = ��״̬����Ӣ��;
		}
		private void ��֪ͨ���μ������и���(boolean is�ҷ�, int Ӣ������λ��, int ���и���)
		{
			while (���и��� > 0)
			{
				����һ��(false);
				���и���--;
			}
			if (get��ǰ����() == ������)
			{
				������װ����.ʵ��.�������(new ״̬�ı���ʾ������(is�ҷ�, Ӣ������λ��, "�����ǳ������", true));
				��״̬����Ӣ��.��ӷ�����Ѫ����״̬(new ���ⷨ����Ѫ״̬��());
			}
		}
		private void ��֪ͨ���μ�����Ѫ()
		{
			if (get��ǰ����() == ������)
			{
				��������();
			}
		}
		@Override
		public String get״̬����() {
			return ��������;
		}
		protected static void ������Ѫ(boolean is�ҷ�, int Ӣ������λ��, ��ս��Ӣ���� �ͷŴ˼��ܵ�Ӣ��, int ���и���, int ����˺�, boolean isȺ���˺�)
		{
			������״̬�� ������״̬ = (������״̬��) �ͷŴ˼��ܵ�Ӣ��.get������Ѫ����״̬(������״̬��.class);
			������״̬.��֪ͨ���μ������и���(is�ҷ�, Ӣ������λ��, ���и���);
			�ͷŴ˼��ܵ�Ӣ��.������Ѫ(����˺�, isȺ���˺�);
			������״̬.��֪ͨ���μ�����Ѫ();
		}
	}
	public �����Ǽ�����()
	{
		super(Integer.MAX_VALUE, Integer.MAX_VALUE);
	}
	@Override
	public void ��ӱ���״̬(��ս��Ӣ���� ��ս��Ӣ��)
	{
		��ս��Ӣ��.��ӷ�����Ѫ����״̬(new ������״̬��(��ս��Ӣ��));
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
