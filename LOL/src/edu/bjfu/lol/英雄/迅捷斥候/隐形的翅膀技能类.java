package edu.bjfu.lol.Ӣ��.Ѹ�ݳ��;

import edu.bjfu.lol.scenes.scene2d.����.������װ����;
import edu.bjfu.lol.scenes.scene2d.����.����������;
import edu.bjfu.lol.scenes.scene2d.����.״̬�ı���ʾ������;
import edu.bjfu.lol.��̬.��ս��Ӣ����;
import edu.bjfu.lol.��̬.��ս��������;
import edu.bjfu.lol.��̬.״̬��;
import edu.bjfu.lol.��̬.������;

class ���εĳ������ extends ������
{
	private static final int ��һ���ͷŻغ��� = 1;
	private static final int �ͷż���غ��� = 15	;
	private static final float ���������ٷֱ� = 40f / 100;
	private static final int �����غ��� = 1;
	private static final String ������ = "���εĳ��";
	private static final String �������� = String.format("%s  ��Ī����Ǳ��״̬,�����\"������ʤ\"����Ч��,����%.0f%%��\n���ٶ�,����%d�غ�.", 
			������,
			���������ٷֱ� * 100, �����غ���);
	private static class ��������״̬�� extends ״̬��
	{
		public ��������״̬��()
		{
			super(�����غ���);
		}
		@Override
		public void ����(��ս��Ӣ���� ��״̬����Ӣ��)
		{
			��״̬����Ӣ��.��ӹ����ٶȰٷֱȱ仯(���������ٷֱ�);
		}
		@Override
		public String get״̬����()
		{
			return "���εĳ�򣬹�������";
		}
	}
	public ���εĳ������()
	{
		super(��һ���ͷŻغ���, �ͷż���غ���);
	}
	@Override
	public String get��������()
	{
		return ��������;
	}
	@Override
	public boolean �ͷ�(��ս�������� �з�����, ��ս��Ӣ���� �ͷŴ˼��ܵ�Ӣ��)
	{
		���������� �������� = new ����������();
		��������.�������(new ״̬�ı���ʾ������(�ͷŴ˼��ܵ�Ӣ��.is�ҷ�(), �ͷŴ˼��ܵ�Ӣ��.getӢ������λ��(), "���١�������", false));
		�ͷŴ˼��ܵ�Ӣ��.��ӹ����ٶ�����״̬(new ��������״̬��());
		�ͷŴ˼��ܵ�Ӣ��.����(�����غ���, ��������);
		������װ����.ʵ��.�������(��������);
		return true;
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
