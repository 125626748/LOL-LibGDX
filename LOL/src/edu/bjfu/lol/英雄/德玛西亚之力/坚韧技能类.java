package edu.bjfu.lol.Ӣ��.��������֮��;

import edu.bjfu.lol.scenes.scene2d.����.������װ����;
import edu.bjfu.lol.scenes.scene2d.����.����������;
import edu.bjfu.lol.scenes.scene2d.����.״̬�ı���ʾ������;
import edu.bjfu.lol.��̬.��ս��Ӣ����;
import edu.bjfu.lol.��̬.״̬��;
import edu.bjfu.lol.��̬.������;

class ���ͼ����� extends ������
{
	private static final float ÿ�غϻظ��������ֵ�ٷֱ� = 0.5f / 100;
	private static final String ������ = "����";
	private static final String �������� = String.format("%s  ����ÿ�غϻظ��Լ��������ֵ��%.1f%%.", ������, ÿ�غϻظ��������ֵ�ٷֱ� * 100);
	private static class ����״̬�� extends ״̬��
	{
		public ����״̬��() {
			super(Integer.MAX_VALUE);
		}
		@Override
		public void ����(��ս��Ӣ���� ��״̬����Ӣ��) {
			���������� �������� = new ����������();
			��������.�������(new ״̬�ı���ʾ������(��״̬����Ӣ��.is�ҷ�(), ��״̬����Ӣ��.getӢ������λ��(), "����", true));
			��״̬����Ӣ��.��������ֵ((int)(��״̬����Ӣ��.get��ս���������ֵ() * ÿ�غϻظ��������ֵ�ٷֱ�), ��������);
			������װ����.ʵ��.�������(��������);
		}
		@Override
		public String get״̬����() {
			return ��������;
		}
	}
	public ���ͼ�����()
	{
		super(Integer.MAX_VALUE, Integer.MAX_VALUE);
	}
	@Override
	public void ��ӱ���״̬(��ս��Ӣ���� ��ս��Ӣ��)
	{
		��ս��Ӣ��.�������ֵ����״̬(new ����״̬��());
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
