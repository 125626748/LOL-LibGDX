package edu.bjfu.lol.Ӣ��.Ƥ��Ů��;

import java.util.Iterator;

import com.badlogic.gdx.Gdx;

import edu.bjfu.lol.scenes.scene2d.����.������װ����;
import edu.bjfu.lol.scenes.scene2d.����.����������;
import edu.bjfu.lol.scenes.scene2d.����.״̬�ı���ʾ������;
import edu.bjfu.lol.��̬.��ս��Ӣ����;
import edu.bjfu.lol.��̬.��ս��Ӣ����.��ͨ��������Ч��״̬��;
import edu.bjfu.lol.��̬.������;

class ��ͷ������ extends ������
{
	private static final int ÿ���ι��� = 4;
	private static final int Ч���������� = ÿ���ι��� + 1;
	private static final float �����˺��ٷֱ� = 50f / 100;
	private static final String ������ = "��ͷ";
	private static final String �������� = String.format("%s  ÿ%d����ͨ����,��������һ��������ͷЧ��,�Ե������%.0f%%�˺�.", ������, ÿ���ι���, �����˺��ٷֱ� * 100);
	private static class ��ͷ״̬�� extends ��ͨ��������Ч��״̬�� 
	{
		public ��ͷ״̬��() {
			super(Integer.MAX_VALUE, Ч����������, 0);
		}
		@Override
		public void ��ͨ����(��ս��Ӣ���� ������, ��ս��Ӣ���� ��������, Iterator<��ͨ��������Ч��״̬��> ������) {
			����һ��(false);
			Gdx.app.debug("��ͷ������.��ͷ״̬��.��ͨ����", String.format("%s��ͷ״̬�������ǵ�%d�ι���\n", ������.get����������λ��Ӣ������(), get��ǰ����()));
			if (get��ǰ����() == Ч����������)
			{
				���������� �������� = new ����������();
				��������.�������(new ״̬�ı���ʾ������(������.is�ҷ�(), ������.getӢ������λ��(), "��ͷ", true));
				int �˺�ֵ = ��������.����������˺�(������, ������.get��ս�й�����(), ������.get��ս����ֵ���״�͸(), ������.get��ս�аٷֱȻ��״�͸(), ��������);
				������װ����.ʵ��.�������(��������);
				������.����͵ȡ(�˺�ֵ);
				��������();
			}
		}
		@Override
		public String get״̬����() {
			return ��������;
		}
	}
	public ��ͷ������()
	{
		super(Integer.MAX_VALUE, Integer.MAX_VALUE);
	}
	@Override
	public void ��ӱ���״̬(��ս��Ӣ���� ��ս��Ӣ��) {
		��ս��Ӣ��.�����ͨ��������Ч��״̬(new ��ͷ״̬��());
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
