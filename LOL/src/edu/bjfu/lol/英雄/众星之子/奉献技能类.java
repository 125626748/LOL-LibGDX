package edu.bjfu.lol.Ӣ��.����֮��;

import edu.bjfu.lol.��̬.��ս��Ӣ����;
import edu.bjfu.lol.��̬.��ս��������;
import edu.bjfu.lol.��̬.״̬��;
import edu.bjfu.lol.��̬.������;

class ���׼����� extends ������
{
	private static final int ħ���������ֵ = 16;
	private static final String ������ = "����";
	private static final String �������� = String.format("%s  ������ʹ���Լ����ѷ�Ӣ�۵�ħ�����������%d.", ������, ħ���������ֵ);
	private static class ����״̬�� extends ״̬��
	{
		public ����״̬��() {
			super(Integer.MAX_VALUE);
		}
		@Override
		public void ����(��ս��Ӣ���� ��״̬����Ӣ��) {
			��״̬����Ӣ��.���ħ��������ֵ�仯(ħ���������ֵ);
		}
		@Override
		public String get״̬����() {
			return ��������;
		}
	}
	public ���׼�����()
	{
		super(Integer.MAX_VALUE, Integer.MAX_VALUE);
	}
	@Override
	public void ��ӱ���״̬(��ս��Ӣ���� ��ս��Ӣ��) {
		// �ѷ�Ӣ����ӷ���״̬
		��ս�������� �ѷ����� = ��ս��Ӣ��.get��������();
		for (��ս��Ӣ���� �ѷ�Ӣ�� : �ѷ�����.get��ս��Ӣ������())
		{
			if (�ѷ�Ӣ�� != null && !�ѷ�Ӣ��.is����())
			{
				�ѷ�Ӣ��.���ħ����������״̬(new ����״̬��());
			}
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
		return "A";
	}
}
