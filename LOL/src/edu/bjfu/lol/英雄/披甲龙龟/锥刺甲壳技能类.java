package edu.bjfu.lol.Ӣ��.��������;

import edu.bjfu.lol.��̬.��ս��Ӣ����;
import edu.bjfu.lol.��̬.״̬��;
import edu.bjfu.lol.��̬.������;

class ׶�̼׿Ǽ����� extends ������
{
	private static final float ת���ٷֱ� = 25f / 100;
	private static final String ������ = "׶�̼׿�";
	private static final String �������� = String.format("%s  ��Ī˹��%.0f%%�Ļ���ֵת��Ϊ������.", ������, ת���ٷֱ� * 100);
	private static class ׶�̼׿�״̬�� extends ״̬�� 
	{
		public ׶�̼׿�״̬��() {
			super(Integer.MAX_VALUE);
		}
		@Override
		public void ����(��ս��Ӣ���� ��״̬����Ӣ��) {
			��״̬����Ӣ��.��ӹ�������ֵ�仯((int) (��״̬����Ӣ��.get��ս�л���ֵ() * ת���ٷֱ�));
		}
		@Override
		public String get״̬����() {
			return ��������;
		}
	}
	public ׶�̼׿Ǽ�����()
	{
		super(Integer.MAX_VALUE, Integer.MAX_VALUE);
	}
	@Override
	public void ��ӱ���״̬(��ս��Ӣ���� ��ս��Ӣ��)
	{
		��ս��Ӣ��.��ӹ���������״̬(new ׶�̼׿�״̬��());
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
