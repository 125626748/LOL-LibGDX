package edu.bjfu.lol.Ӣ��.��������;

import java.util.Iterator;

import edu.bjfu.lol.scenes.scene2d.����.������װ����;
import edu.bjfu.lol.scenes.scene2d.����.����������;
import edu.bjfu.lol.scenes.scene2d.����.״̬�ı���ʾ������;
import edu.bjfu.lol.��̬.��ս��Ӣ����;
import edu.bjfu.lol.��̬.��ս��Ӣ����.��ͨ��������Ч��״̬��;
import edu.bjfu.lol.��̬.״̬��;
import edu.bjfu.lol.��̬.������;

class ǹ�ڽ����������� extends ������ {
	private static final float �����˺��ٷֱ� = 10f / 100;
	private static final float ÿ����߹��ٰٷֱ� = 3f / 100;
	private static final int �������������غ��� = 2;
	private static final String ������ = "ǹ�ڽ�����";
	private static final String �������� = String.format("%s  ���˿����ͨ������Ŀ�����Χ�������%.0f%%�����˺�,��\nÿ����ͨ������߹���%.0f%%,����%d�غ�.", 
			������, �����˺��ٷֱ� * 100, ÿ����߹��ٰٷֱ� * 100, �������������غ���);
	private static class ��ͨ��������״̬�� extends ��ͨ��������Ч��״̬��
	{
		public ��ͨ��������״̬��() {
			super(Integer.MAX_VALUE);
		}
		@Override
		public void ��ͨ����(��ս��Ӣ���� ������, ��ս��Ӣ���� ��������, Iterator<��ͨ��������Ч��״̬��> ������) {
			���������� �������� = new ����������();
			for (��ս��Ӣ���� ���� : ��������.get��������().getĬ�ϱ�����С��ΧӢ������(������))
			{
				if (���� != null && !����.is����())
				{
					��������.�������(new ״̬�ı���ʾ������(����.is�ҷ�(), ����.getӢ������λ��(), "����", false));
					����.����������˺�(������, (int)((���� == �������� ? �����˺��ٷֱ� : (�����˺��ٷֱ� + 1)) * ������.get��ս�й�����()), ������.get��ս����ֵ���״�͸(), ������.get��ս�аٷֱȻ��״�͸(), ��������);
				}
			}
			������װ����.ʵ��.�������(��������);
		}
		@Override
		public String get״̬����() {
			return "ǹ�ڽ���������ͨ������ɽ����˺�";
		}
	}
	private static class ��ͨ������������״̬�� extends ��ͨ��������Ч��״̬��
	{
		private static class ��������״̬�� extends ״̬��
		{
			public ��������״̬��() {
				super(�������������غ���, Integer.MAX_VALUE, 1);
			}
			@Override
			public void ����(��ս��Ӣ���� ��״̬����Ӣ��) {
				��״̬����Ӣ��.��ӹ����ٶȰٷֱȱ仯(get��ǰ����() * ÿ����߹��ٰٷֱ�);
			}
			@Override
			public String get״̬����() {
				return "ǹ�ڽ�������������������" + get��ǰ����();
			}
		}
		public ��ͨ������������״̬��() {
			super(Integer.MAX_VALUE);
		}
		@Override
		public void ��ͨ����(��ս��Ӣ���� ������, ��ս��Ӣ���� ��������, Iterator<��ͨ��������Ч��״̬��> ������) {
			״̬�� ��������״̬ = ������.get�����ٶ�����״̬(��������״̬��.class);
			if (��������״̬ == null)
			{
				������.��ӹ���������״̬(new ��������״̬��());
			}
			else
			{
				������װ����.ʵ��.�������(new ״̬�ı���ʾ������(������.is�ҷ�(), ������.getӢ������λ��(), "���١�", true));
				��������״̬.����һ��(false);
				��������״̬.����״̬�غ���();
			}
		}
		@Override
		public String get״̬����() {
			return "ǹ�ڽ���������ͨ��������߹���";
		}
	}
	public ǹ�ڽ�����������() {
		super(Integer.MAX_VALUE, Integer.MAX_VALUE);
	}
	@Override
	public String get��������() {
		return ��������;
	}
	@Override
	public String get������() {
		return ������;
	}
	@Override
	public void ��ӱ���״̬(��ս��Ӣ���� ��ս��Ӣ��) {
		��ս��Ӣ��.�����ͨ��������Ч��״̬(new ��ͨ��������״̬��());
		��ս��Ӣ��.�����ͨ��������Ч��״̬(new ��ͨ������������״̬��());
	}
	@Override
	public String get�����ļ���׺()
	{
		return "B";
	}
}
