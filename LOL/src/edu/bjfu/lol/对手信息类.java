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
import edu.bjfu.lol.�߼�.������;
import edu.bjfu.lol.��̬.Ӣ����;
import edu.bjfu.lol.��̬.������;

public class ������Ϣ��
{
	private static final ������ ���� = new ������();
	private static final Preferences ������Ϣ;
	private static final LinkedList<Class<? extends Ӣ����>> Ӣ�����б� = new LinkedList<Class<? extends Ӣ����>>();
	static
	{
		������Ϣ = Gdx.app.getPreferences("����������Ϣ");
		Ӣ�����б�.add(��������Ӣ����.class);
		Ӣ�����б�.add(��������֮��Ӣ����.class);
		Ӣ�����б�.add(����֮��Ӣ����.class);
		Ӣ�����б�.add(��������Ӣ����.class);
		Ӣ�����б�.add(��β����Ӣ����.class);
		Ӣ�����б�.add(���ƴ�ʦӢ����.class);
		Ӣ�����б�.add(ĺ��֮��Ӣ����.class);
		Ӣ�����б�.add(��������Ӣ����.class);
		Ӣ�����б�.add(Ƥ��Ů��Ӣ����.class);
		Ӣ�����б�.add(������ʹӢ����.class);
		Ӣ�����б�.add(��Ѫ����Ӣ����.class);
		Ӣ�����б�.add(�޼���ʥӢ����.class);
		Ӣ�����б�.add(а��С��ʦӢ����.class);
		Ӣ�����б�.add(Ѹ�ݳ��Ӣ����.class);
		Ӣ�����б�.add(����֮��Ӣ����.class);
		Ӣ����[] Ӣ������ = new Ӣ����[5];
		boolean is��һ���������� = true;
		for (int i = 0; i < Ӣ������.length; i++)
		{
			String ���� = ������Ϣ.getString(i+"");
			if (����.length() > 0)
			{
				try
				{
					Ӣ������[i] = (Ӣ����) Class.forName(����).newInstance();
					is��һ���������� = false;
				}
				catch (Exception ex)
				{
					ex.printStackTrace();
				}
			}
		}
		if (is��һ����������)
		{
			Ӣ������ = �������Ӣ������(Ӣ�����б�);
			����.setӢ������(Ӣ������);
			��������();
		}
		else
		{
			����.setӢ������(Ӣ������);
		}
	}
	private static Ӣ����[] �������Ӣ������(LinkedList<Class<? extends Ӣ����>> ���б�)
	{
		Ӣ����[] Ӣ������ = new Ӣ����[5];
		LinkedList<Class<? extends Ӣ����>> �ϳ�Ӣ�����б� = new LinkedList<Class<? extends Ӣ����>>();
		�ϳ�Ӣ�����б�.addAll(���б�);
		for (int i = 0; i < Ӣ������.length; i++)
		{
			int ����� = ������.�������ֵ(�ϳ�Ӣ�����б�.size() + 1);
			if (����� < �ϳ�Ӣ�����б�.size())
			{
				try
				{
					Ӣ������[i] = �ϳ�Ӣ�����б�.get(�����).newInstance();
					�ϳ�Ӣ�����б�.remove(�����);
				}
				catch (Exception ex)
				{
					ex.printStackTrace();
				}
			}
		}
		return Ӣ������;
	}
	private static boolean is����Ӣ������һ��(Ӣ����[] ����һ, Ӣ����[] �����)
	{
		boolean isһ�� = true;
		for (int i = 0; i < ����һ.length; i++)
		{
			if (����һ[i] == null)
			{
				if (�����[i] != null)
				{
					isһ�� = false;
					break;
				}
			}
			else
			{
				if (�����[i] != null && ����һ[i].getClass() != �����[i].getClass())
				{
					isһ�� = false;
					break;
				}
				else
				{
					isһ�� = false;
					break;
				}
			}
		}
		return isһ��;
	}
	public static ������ get����()
	{
		return ����;
	}
	public static void ���ɲ�һ�����������()
	{
		Ӣ����[] ��ǰӢ������ = ����.getӢ������();
		while (true)
		{
			Ӣ����[] ��Ӣ������ = �������Ӣ������(Ӣ�����б�);
			if (!is����Ӣ������һ��(��ǰӢ������, ��Ӣ������))
			{
				����.setӢ������(��Ӣ������);
				break;
			}
		}
		��������();
	}
	private static void ��������()
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
