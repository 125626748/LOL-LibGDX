package edu.bjfu.lol.Ӣ��.��������;

import edu.bjfu.lol.scenes.scene2d.����.������װ����;
import edu.bjfu.lol.scenes.scene2d.����.״̬�ı���ʾ������;
import edu.bjfu.lol.��̬.��ս��Ӣ����;
import edu.bjfu.lol.��̬.״̬��;
import edu.bjfu.lol.��̬.������;

class ȫ���ע������ extends ������
{
	private static final float ����������߰ٷֱ� = 0.1f;
	private static final String ������ = "ȫ���ע";
	private static final String �������� = String.format("%s  ��ϣȫ���ע,��߱�������%.0f%%.", ������, ����������߰ٷֱ� * 100);
	private static class ȫ���ע״̬�� extends ״̬��
	{
		public ȫ���ע״̬��()
		{
			super(Integer.MAX_VALUE);
		}
		@Override
		public void ����(��ս��Ӣ���� ��״̬����Ӣ��)
		{
			��״̬����Ӣ��.��ӱ������ʰٷֱȱ仯(����������߰ٷֱ�);
		}
		@Override
		public String get״̬����()
		{
			return ��������;
		}
	}
	public ȫ���ע������()
	{
		super(Integer.MAX_VALUE, Integer.MAX_VALUE);
	}
	@Override
	public void ��ӱ���״̬(��ս��Ӣ���� ��ս��Ӣ��)
	{
		������װ����.ʵ��.�������(new ״̬�ı���ʾ������(��ս��Ӣ��.is�ҷ�(), ��ս��Ӣ��.getӢ������λ��(), "�������ʡ�", true));
		��ս��Ӣ��.��ӱ�����������״̬(new ȫ���ע״̬��());
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
