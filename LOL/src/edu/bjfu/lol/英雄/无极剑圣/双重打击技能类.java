package edu.bjfu.lol.Ӣ��.�޼���ʥ;

import java.util.Iterator;

import com.badlogic.gdx.Gdx;

import edu.bjfu.lol.scenes.scene2d.����.������װ����;
import edu.bjfu.lol.scenes.scene2d.����.״̬�ı���ʾ������;
import edu.bjfu.lol.��̬.��ս��Ӣ����;
import edu.bjfu.lol.��̬.��ս��Ӣ����.��ͨ��������Ч��״̬��;
import edu.bjfu.lol.��̬.������;

class ˫�ش�������� extends ������
{
	private static final int ÿ�ڼ��ι��� = 4;
	private static final float ���Ĵι��������������ٰٷֱ� = 50f / 100;
	private static final String ������ = "˫�ش��";
	private static final String �������� = String.format("%s  �״�ʦÿ��%d�ι���������˫�ش��,�ڶ��δ�������%.0f%%\n�˺�.", ������, ÿ�ڼ��ι���, ���Ĵι��������������ٰٷֱ� * 100);
	private static class ˫�ش��״̬�� extends ��ͨ��������Ч��״̬��
	{
		public ˫�ش��״̬��()
		{
			super(Integer.MAX_VALUE, ÿ�ڼ��ι���, 0);
		}
		@Override
		public void ��ͨ����(��ս��Ӣ���� ������, ��ս��Ӣ���� ��������, Iterator<��ͨ��������Ч��״̬��> ������)
		{
			����һ��(false);
			Gdx.app.debug("˫�ش��������.˫�ش��״̬��.��ͨ����", String.format("%s˫�ش��״̬�������ǵ�%d�ι���\n", ������.get����������λ��Ӣ������(), get��ǰ����()));
			if (get��ǰ����() == ÿ�ڼ��ι���)
			{
				������װ����.ʵ��.�������(new ״̬�ı���ʾ������(������.is�ҷ�(), ������.getӢ������λ��(), "˫�ش��", true));
				Gdx.app.debug("˫�ش��������.˫�ش��״̬��.��ͨ����", String.format("%s����˫�ش������������%.0f%%\n", ������.get����������λ��Ӣ������(), ���Ĵι��������������ٰٷֱ� * 100));
				if (!��������.is����())
				{
					������.��ͨ����(��������, ���Ĵι��������������ٰٷֱ�, true, true);
					������һ();
				}
			}
		}
		@Override
		public String get״̬����()
		{
			return ��������;
		}
	}
	public ˫�ش��������()
	{
		super(Integer.MAX_VALUE, Integer.MAX_VALUE);
	}
	@Override
	public void ��ӱ���״̬(��ս��Ӣ���� ��ս��Ӣ��)
	{
		��ս��Ӣ��.�����ͨ��������Ч��״̬(new ˫�ش��״̬��());
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
