package edu.bjfu.lol.Ӣ��.��Ѫ����;

import java.util.Iterator;

import com.badlogic.gdx.Gdx;

import edu.bjfu.lol.scenes.scene2d.����.������װ����;
import edu.bjfu.lol.scenes.scene2d.����.����������;
import edu.bjfu.lol.scenes.scene2d.����.״̬�ı���ʾ������;
import edu.bjfu.lol.��̬.��ս��Ӣ����;
import edu.bjfu.lol.��̬.��ս��Ӣ����.��ͨ��������Ч��״̬��;
import edu.bjfu.lol.��̬.������;

class Ѫ֮���ʼ����� extends ������
{
	private static final int ÿ�����ħ���˺�ֵ = 3;
	private static final int �����Ӳ��� = 3;
	private static final int �����غ��� = 2;
	private static final String ������ = "Ѫ֮����";
	private static final String �������� = String.format("%s  �����ÿ�ι������%d��ħ���˺����ظ���������ֵ,��ͬһ\n����λ��������ʱЧ������,������%d��,����%d�غ�.", ������, ÿ�����ħ���˺�ֵ, �����Ӳ���, �����غ���);
	private static class Ѫ֮����״̬�� extends ��ͨ��������Ч��״̬��
	{
		private ��ս��Ӣ���� ��һ�α�����Ӣ��;
		private static class Ѫ֮���ʳ���״̬�� extends ��ͨ��������Ч��״̬��
		{
			public Ѫ֮���ʳ���״̬��() {
				super(�����غ���, �����Ӳ���, 1);
			}
			@Override
			public String get״̬����() {
				return "Ѫ֮���ʳ���״̬";
			}
		}
		public Ѫ֮����״̬��() {
			super(Integer.MAX_VALUE);
		}
		@Override
		public String get״̬����() {
			return ��������;
		}
		@Override
		public void ��ͨ����(��ս��Ӣ���� ������, ��ս��Ӣ���� ��������, Iterator<��ͨ��������Ч��״̬��> ������) {
			��ͨ��������Ч��״̬�� ����״̬ = (��ͨ��������Ч��״̬��) ������.get��ͨ��������Ч��״̬(Ѫ֮���ʳ���״̬��.class); 
			if (����״̬ == null)
			{
				��һ�α�����Ӣ�� = ��������;
				����״̬ = new Ѫ֮���ʳ���״̬��();
				������.�����ͨ��������Ч��״̬(����״̬);
			}
			else
			{
				����״̬.����״̬�غ���();
				if (��һ�α�����Ӣ�� != ��������)
				{
					��һ�α�����Ӣ�� = ��������;
					����״̬.������һ();
				}
				else
				{
					����״̬.����һ��(false);
				}
			}
			������װ����.ʵ��.�������(new ״̬�ı���ʾ������(������.is�ҷ�(), ������.getӢ������λ��(), "Ѫ֮����,����" + ����״̬.get��ǰ����(), true));
			���������� �������� = new ����������();
			Gdx.app.debug("Ѫ֮���ʼ�����.Ѫ֮����״̬��.��ͨ����", String.format("%s����Ѫ֮���ʣ���ǰ����Ϊ%d\n", ������.get����������λ��Ӣ������(), ����״̬.get��ǰ����()));
			int ħ���˺� = ��������.�����ħ���˺�(������, ����״̬.get��ǰ����() * ÿ�����ħ���˺�ֵ, ������.get��ս����ֵ������͸(), ������.get��ս�аٷֱȷ�����͸(), ��������);
			������.��������ֵ(����״̬.get��ǰ����() * ÿ�����ħ���˺�ֵ, ��������);
			������װ����.ʵ��.�������(��������);
			������.������Ѫ(ħ���˺�, false);			
		}
	}
	public Ѫ֮���ʼ�����()
	{
		super(Integer.MAX_VALUE, Integer.MAX_VALUE);
	}
	@Override
	public void ��ӱ���״̬(��ս��Ӣ���� ��ս��Ӣ��)
	{
		��ս��Ӣ��.�����ͨ��������Ч��״̬(new Ѫ֮����״̬��());
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
