package edu.bjfu.lol.��̬;

public class ������ {
	private Ӣ����[] Ӣ������;
	public Ӣ����[] getӢ������() {
		return Ӣ������;
	}
	public void setӢ������(Ӣ����[] Ӣ������) {
		this.Ӣ������ = Ӣ������;
	}
	public ������(Ӣ����[] Ӣ������)
	{
		this.Ӣ������ = Ӣ������;
	}
	public ������()
	{}
	public boolean is������Ӣ��(Ӣ���� Ӣ��)
	{
		if (Ӣ�� == null)
		{
			return false;
		}
		else
		{
			for (int i = 0; i < Ӣ������.length; i++)
			{
				if (Ӣ������[i] == Ӣ��)
				{
					return true;
				}
			}
			return false;
		}
	}
}
