package com.ldg.impl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.connection.RedisStringCommands;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.types.Expiration;

import com.ldg.api.service.RedisService;

//暂时不启用
//@Service
public class RedisServiceImpl implements RedisService {
	@Autowired
	private StringRedisTemplate stringRedisTemplate;

	@Override
	public void setData(String key, String val) {
		stringRedisTemplate.execute(new RedisCallback<String>() {
			@Override
			public String doInRedis(RedisConnection connection) throws DataAccessException {
				connection.set(key.getBytes(), val.getBytes());
				return null;
			}
		});
	}

	@Override
	public void setDataByExpiration(String key, String val, Long milliseconds) {
		stringRedisTemplate.execute(new RedisCallback<String>() {
			@Override
			public String doInRedis(RedisConnection connection) throws DataAccessException {
				Expiration expiration = Expiration.milliseconds(milliseconds);
				connection.set(key.getBytes(), val.getBytes(), expiration, RedisStringCommands.SetOption.UPSERT);
				return null;
			}
		});
	}

	@Override
	public String getDataByKey(String key) {
		return stringRedisTemplate.execute(new RedisCallback<String>() {
			@Override
			public String doInRedis(RedisConnection connection) throws DataAccessException {
				byte[] b = connection.get(key.getBytes());
				if (null != b) {
					return new String(b);
				} else {
					return null;
				}

			}
		});
	}

	@Override
	public Long delDataByKey(String key) {
		return stringRedisTemplate.execute(new RedisCallback<Long>() {
			@Override
			public Long doInRedis(RedisConnection connection) throws DataAccessException {
				return connection.del(key.getBytes());
			}
		});
	}
}
