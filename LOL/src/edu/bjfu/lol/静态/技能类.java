package edu.bjfu.lol.��̬;

import edu.bjfu.lol.��̬.��ս��Ӣ����;
import edu.bjfu.lol.��̬.��ս��������;

public abstract class ������ {
	private int ��һ���ͷŻغ���;
	private int �ͷż���غ���;
	public int get��һ���ͷŻغ���() {
		return ��һ���ͷŻغ���;
	}
	public int get�ͷż���غ���() {
		return �ͷż���غ���;
	}
	public ������(int ��һ���ͷŻغ���, int �ͷż���غ���)
	{
		this.��һ���ͷŻغ��� = ��һ���ͷŻغ���;
		this.�ͷż���غ��� = �ͷż���غ���;
	}
	// �����༼����Ҫ��ӱ���״̬ʱ��Ҫ���ظ÷���
	public void ��ӱ���״̬(��ս��Ӣ���� ��ս��Ӣ��)
	{}
	/**
	 * ������ʵ�ָ÷���ʵ�ּ��ܵ��ͷ�
	 * @return �ͷ��Ƿ�ɹ�
	 */
	public boolean �ͷ�(��ս�������� �з�����, ��ս��Ӣ���� �ͷŴ˼��ܵ�Ӣ��){return true;}
	/**
	 * ����ʵ�ָ÷������ؼ�������
	 */
	public abstract String get��������();
	/**
	 * ����ʵ�ָ÷������ؼ�����
	 */
	public abstract String get������();
	public abstract String get�����ļ���׺();
	/**
	 * Ĭ��Ϊfalse,���м��������ظ÷���
	 */
	public boolean is����()
	{
		return false;
	}
}
