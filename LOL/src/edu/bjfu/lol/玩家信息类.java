package edu.bjfu.lol;

import java.util.LinkedList;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Preferences;

import edu.bjfu.lol.Ӣ��.��β����.��β����Ӣ����;
import edu.bjfu.lol.Ӣ��.����֮��.����֮��Ӣ����;
import edu.bjfu.lol.Ӣ��.���ƴ�ʦ.���ƴ�ʦӢ����;
import edu.bjfu.lol.Ӣ��.��Ѫ����.��Ѫ����Ӣ����;
import edu.bjfu.lol.Ӣ��.������ʹ.������ʹӢ����;
import edu.bjfu.lol.Ӣ��.��������.��������Ӣ����;
import edu.bjfu.lol.Ӣ��.��������֮��.��������֮��Ӣ����;
import edu.bjfu.lol.Ӣ��.��������.��������Ӣ����;
import edu.bjfu.lol.Ӣ��.����֮��.����֮��Ӣ����;
import edu.bjfu.lol.Ӣ��.�޼���ʥ.�޼���ʥӢ����;
import edu.bjfu.lol.Ӣ��.ĺ��֮��.ĺ��֮��Ӣ����;
import edu.bjfu.lol.Ӣ��.��������.��������Ӣ����;
import edu.bjfu.lol.Ӣ��.Ƥ��Ů��.Ƥ��Ů��Ӣ����;
import edu.bjfu.lol.Ӣ��.Ѹ�ݳ��.Ѹ�ݳ��Ӣ����;
import edu.bjfu.lol.Ӣ��.а��С��ʦ.а��С��ʦӢ����;
import edu.bjfu.lol.��̬.Ӣ����;
import edu.bjfu.lol.��̬.������;

public class �����Ϣ��
{
	private static final LinkedList<Ӣ����> Ӣ���б� = new LinkedList<Ӣ����>();
	private static final ������ ���� = new ������();
	private static final Preferences ������Ϣ;
	static
	{
		������Ϣ = Gdx.app.getPreferences("���������Ϣ");
		Ӣ���б�.add(new ��������Ӣ����());
		Ӣ���б�.add(new ��������֮��Ӣ����());
		Ӣ���б�.add(new ����֮��Ӣ����());
		Ӣ���б�.add(new ��������Ӣ����());
		Ӣ���б�.add(new ��β����Ӣ����());
		Ӣ���б�.add(new ���ƴ�ʦӢ����());
		Ӣ���б�.add(new ĺ��֮��Ӣ����());
		Ӣ���б�.add(new ��������Ӣ����());
		Ӣ���б�.add(new Ƥ��Ů��Ӣ����());
		Ӣ���б�.add(new ������ʹӢ����());
		Ӣ���б�.add(new ��Ѫ����Ӣ����());
		Ӣ���б�.add(new �޼���ʥӢ����());
		Ӣ���б�.add(new а��С��ʦӢ����());
		Ӣ���б�.add(new Ѹ�ݳ��Ӣ����());
		Ӣ���б�.add(new ����֮��Ӣ����());
		Ӣ����[] Ӣ������ = new Ӣ����[5];
		for (int i = 0; i < Ӣ������.length; i++)
		{
			String ���� = ������Ϣ.getString(i+"");
			if (����.length() > 0)
			{
				try
				{
					for (Ӣ���� Ӣ�� : Ӣ���б�)
					{
						if (Ӣ��.getClass().getName().equals(����))
						{
							Ӣ������[i] = Ӣ��;
							break;
						}
					}
				}
				catch (Exception ex)
				{
					ex.printStackTrace();
				}
			}
		}
		����.setӢ������(Ӣ������);
	}
	public static LinkedList<Ӣ����> getӢ���б�()
	{
		return Ӣ���б�;
	}
	public static ������ get����()
	{
		return ����;
	}
	public static void ��������()
	{
		Ӣ����[] Ӣ������ = ����.getӢ������();
		for (int i = 0; i < 5; i++)
		{
			if (Ӣ������[i] != null)
			{
				������Ϣ.putString(i+"", Ӣ������[i].getClass().getName());
			}
			else
			{
				������Ϣ.remove(i+"");
			}
		}
		������Ϣ.flush();
	}
}
